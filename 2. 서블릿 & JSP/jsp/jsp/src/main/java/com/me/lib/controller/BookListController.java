package com.me.lib.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.me.dto.Criteria;
import com.me.dto.PageDto;
import com.me.lib.dao.BookDao;

@WebServlet("/book/bookList")
public class BookListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * 도서목록을 조회 후 request영역에 저장한다.
	 * bookList.jsp로 forward한다.
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 사용자의 요청 정보를 확인한다.
		Criteria cri = new Criteria(
								request.getParameter("pageNo")		// 요청 페이지 번호(기본값 : 1)
								, request.getParameter("amount")  	// 페이지당 게시물 수(기본값 : 10)
								, request.getParameter("searchField")
								, request.getParameter("searchWord")
								);
		System.out.println(cri);
		BookDao dao = new BookDao();
		// 도서목록 조회 후 reqeust영역에 담는다. 조회하기 위해서
		request.setAttribute("list", dao.getList(cri));
		
		// 페이지 블럭을 생성하기 위해
		PageDto pageDto = new PageDto(dao.getTotalCnt(cri), cri);
		request.setAttribute("pageDto", pageDto);
		
		dao.close();
		request.getRequestDispatcher("/book/bookList.jsp").forward(request, response);
	}
}