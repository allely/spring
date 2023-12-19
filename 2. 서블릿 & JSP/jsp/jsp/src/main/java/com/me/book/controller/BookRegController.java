package com.me.book.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.me.lib.dao.BookDao;
import com.me.lib.dto.BookDto;

@WebServlet("/book/bookRegProcess")
public class BookRegController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("get방식 요청입니다. 확인 후 다시 요청해주세요.").append(request.getContextPath());
	}

	/**
	 * 도서 등록 후 메세지 처리
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 파라메터를 수집 후 bookDto를 생성한다.
		System.out.println("??");
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		request.getParameter("content");
		request.getParameter("imgFile");
		
		BookDto dto = new BookDto("", title, author, "");
		
		// 도서 등록처리
		BookDao dao = new BookDao();
		int res = dao.regBook(dto);
		
		// 입력 성공
		if(res > 0) {
			request.setAttribute("msg", "등록되었습니다.");
			request.setAttribute("url", "/book/bookList");
		// 입력 실패
		} else {
			request.setAttribute("msg", "등록 중 예외가 발생했습니다.\n관리자에게 문의해주세요.");
			
		}
		
		//페이지 전환(도서등록 성공 : 목록 페이지로 이동, 실패 : 뒤로가기)
		request.getRequestDispatcher("/msgBox.jsp").forward(request, response);
	}
}