package com.me.book.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.me.dao.FileDao;
import com.me.dto.FileDto;
import com.oreilly.servlet.MultipartRequest;


@WebServlet("/upload/uploadProcess")
public class UploadProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UploadProcess() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("method : get").append(request.getContextPath());
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// enctype을 지정하게 되면 request.getparameter
		System.out.println("request.getParameter()" + request.getParameter("name"));

		// 업로드된 파일의 정보를 출력
		
		/* 1. MultipartRequest 객체 생성
		 * 	요청파일을 해당 경로제 생성
		 * 		- 파일을 저장할 경로를 저장해야 한다.
		 * 		- 파일의 최대 사이즈를 지정한다.
		 * 		- 한글깨짐이 발생할 수 있으므로인코딩 타입을 저장한다.
		 * 
		 */
		MultipartRequest mr = new MultipartRequest(request, "c:/upload", 1024*1000, "UTF-8");
		System.out.println("mr.getParameter(name)" + mr.getParameter("name"));
		System.out.println("mr.getParameter(title)" + mr.getParameter("title"));
		System.out.println("mr.getParameterValues(cate)" + mr.getParameterValues("cate"));
				
		System.out.println("mr.getParameter()" + mr.getParameterValues("cate"));
		
		// 요청 정보를 수집하여 DTO 객체를 생성한다.
		FileDto fileDto = new FileDto();
		fileDto.setName(mr.getParameter("name"));
		fileDto.setTitle(mr.getParameter("title"));
		fileDto.setCate(mr.getParameterValues("cate"));
		
		System.out.println("==========================");
		System.out.println("fileDto : " + fileDto);
		
		// name속성을 이용해 파일을 확인 
		String fileName = mr.getFilesystemName("attachedFile");
		
		/* 파일이 첨부된 경우
		 *  - 중복된 파일을 업로드하는 경우 ㅣ존에 저장된 파일이 소실될 우려가 있으므로 파일명을 변경하여 저장합니다.
		 *  - 파일을 저장할 때는 /년/월/일 폴더를 생성 후 파일명에 날짜를 붙여서 저장
		 *  - 파일을 저장할 때 파일명_날짜시간.확장자
		 *  - 파일을 저장할 때 날짜시간_파일명.확장자
		 */
		if(fileName != null && !fileName.equals("")) {
			// 새로운 파일이름을 생성 :  원본파일명 + 시간날짜(uuid) + 확장자
			// H : 0~23, S : millisecond
			String now = new SimpleDateFormat("yyyyMMdd_HmsS").format(new Date());
			
			// 첨부파일의 확장자
			String ext = fileName.substring(fileName.lastIndexOf("."));
			
			// 원본파일명
			String oFileName = fileName.substring(0,fileName.lastIndexOf("."));
			String newFileName = oFileName + now + ext;
			System.out.println("newFileName : " + newFileName);
			
			File oldFile = new File("c:/upload/" + fileName);
			File newFile = new File("c:/upload/" + newFileName);
			
			// 파일이름을 변경
			oldFile.renameTo(newFile);
			
			// 원본파일명과 변경된 파일명을 각각 DTO에 저장한다.
			fileDto.setOfile(fileName);
			fileDto.setSfile(newFileName);
		}
		System.out.println("파일명 : " + fileName);
		
		// 입력된 내용을 DB에 저장한다.
		FileDao dao = new FileDao();
		int res = dao.regFile(fileDto);
		
		if(res > 0) {
			request.setAttribute("msg", "등록되었습니다.");
			// list.jsp를 바로 호출할 경우 데이터를 조회할 수 없으므로
			// 서블릿을 호출한다.
			request.setAttribute("url", "/10.upload/list");
		} else {
			request.setAttribute("msg", "등록 중 예외사항이 발생했습니다. 관리자에게 문의해주세요.");
		}
		request.getRequestDispatcher("msgBox.jsp").forward(request, response);
	}

}
