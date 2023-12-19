package com.me.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.me.dao.BoardDao;
import com.me.dao.MemberDao;
import com.me.dto.Criteria;
import com.me.dto.MemberDto;
import com.me.dto.PageDto;

@WebServlet("/06.session/servletEx/loginProcess")
public class loginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	/**
	 * Ccontroller의 역할
	 * 	- 파라메터 수집
	 * 	- 페이지 전환(jsp로 요청을 위임)
	 * 
	 * 사용자의 로그인 요청을 처리
	 * 1. 파라메터 수집(id, pw)
	 * 2. DB로부터 해당 사용자가 있는지 확인
	 *   2-1. 사용자가 존재하면 로그인 처리(세션에 사용자 정보 저장)
	 *   2-2. 사용자가 존재하지 않으면 이전 페이지로 넘어가서 오류 메세지 출력
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 파라메터 수집
		String id = request.getParameter("user_id");
		String pw = request.getParameter("user_pw");
		
		// 사용자정보 인증
		MemberDao dao = new MemberDao();
		MemberDto dto = dao.login(id, pw);
		
		dao.close();
		
		// 페이지 전환
		if(dto != null) {
			// 로그인 성공
			
			// servlet에서 세션을 사용하기 위해서 request로부터 꺼내온다.
			HttpSession session = request.getSession();
			
			session.setAttribute("dto", dto);
			session.setAttribute("userId", id);
			
			// 게시글 조회 후 request에 담아준다.
			Criteria cri = new Criteria();
			BoardDao boardDao = new BoardDao();
			PageDto pageDto = new PageDto(boardDao.getTotalCnt(cri), cri);
			request.setAttribute("pageDto", pageDto);
			request.setAttribute("list",boardDao.getList(cri));
			boardDao.close();
			
			//sendRedirect를 이용할 경우 request영역이 공유되지 않기 때문에
			// list값을 화면으로 전달할 수 없다.
			//response.sendRedirect("board.jsp");
			request.getRequestDispatcher("board.jsp").forward(request, response);
		} else {
			// 로그인 실패
			response.sendRedirect("loginForm.jsp?isError=1");
		}
	}
}