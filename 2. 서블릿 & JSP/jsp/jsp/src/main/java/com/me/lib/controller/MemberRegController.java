package com.me.lib.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.me.dao.MemberDao;
import com.me.dto.MemberDto;


@WebServlet("/book/regProcess")
public class MemberRegController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet() 요청!");
		
		// 한글깨짐 처리
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out =  response.getWriter();
		out.append("post방식으로 요청해주세요!");		
	}
	/**
	 * 회원가입을 진행한다.
	 */
  	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/book/regProcess 요청!");
		
		// 파라메터 수집
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		
		// dto객체 생성
		MemberDto dto = new MemberDto(id, pw, name, "", email);
		System.err.println(dto);
		MemberDao dao = new MemberDao();
		
		// 회원가입
		int res = dao.regMember(dto);
		// 자원 반납
		dao.close();
		
		// 페이지 전환(성공 : 로그인페이지로 이동, 실패 : 뒤로가기)
		if(res >0) {
			// 회원가입 성공
			request.setAttribute("msg", "회원가입 성공! 로그인 후 이용해주세요.");
			request.setAttribute("url", "/06.session/servletEx/loginForm.jsp");
		} else {
			// 회원가입 실패 
			// - 컬럼의 사이즈보다 입력값이 큰 경우, 타입이 맞지 않는 경우
			request.setAttribute("msg", "회원가입 실패! 관리자에게 문의해주세요.");
		}

		
		// forward방식으로 페이지 전환 - request영역을 공유
		request.getRequestDispatcher("/book/msgBox.jsp").forward(request, response);
	}

}
