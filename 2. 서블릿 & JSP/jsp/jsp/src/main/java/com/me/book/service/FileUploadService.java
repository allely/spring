package com.me.book.service;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import com.me.dao.FileDao;
import com.me.dto.FileDto;
import com.oreilly.servlet.MultipartRequest;

public class FileUploadService {
	private int maxSize = 1024*1000;
	private String uploadDir = "c:/upload";
	private String encode = "UTF-8";
	
	public FileUploadService() {}
	
	public FileUploadService(int maxSize, String uploadDir, String encode) {
		super();
		this.maxSize = maxSize;
		this.uploadDir = uploadDir;
		this.encode = encode;
	}
	
	public MultipartRequest fileUpload(HttpServletRequest request, String uploadFile, String cate) {
		int res = 0;
		
		try {
			MultipartRequest mr = new MultipartRequest(request, uploadDir, maxSize, encode);
			String fileName = mr.getFilesystemName(uploadFile);
			// 파일이 첨부된 경우 파일의 이름을 변경 후 파일정보를 DB에 저장한다.
			if(fileName != null && !"".equals(fileName)) {
				String oFileName = rename(fileName);
				
				FileDto fileDto = new FileDto();
				fileDto.setSfile(oFileName);
				fileDto.setOfile(oFileName);
				fileDto.setCate(cate);
				fileDto.setName("");
				fileDto.setTitle("");				

				// 저장된 파일의 이력을 관리하기 위해서 DB에 저장한다.
				FileDao dao = new FileDao();
				dao.regFile(fileDto);				
			}
			return mr;
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		return null;
	}
	
	/**
	 * 중복된 파일명의 경우 소실될 위험이 있으므로 파일명을 변경한다.
	 * 파일의 이름을 변경하고 변경된 이름을 반환한다.
	 */
	public String rename(String fileName) {
		String oFileName = "";
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
			oFileName = fileName.substring(0,fileName.lastIndexOf("."));
			String newFileName = oFileName + now + ext;
			System.out.println("newFileName : " + newFileName);
			
			File oldFile = new File("c:/upload/" + fileName);
			File newFile = new File("c:/upload/" + newFileName);
			
			// 파일이름을 변경
			oldFile.renameTo(newFile);
		}
		return oFileName;
	}
}
