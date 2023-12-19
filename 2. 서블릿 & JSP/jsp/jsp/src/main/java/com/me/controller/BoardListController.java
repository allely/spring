package com.me.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.me.dao.BoardDao;
import com.me.dto.Criteria;
import com.me.dto.PageDto;


@WebServlet("/boardList")
public class BoardListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * 게시글 목록을 조회
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request.getParameter("searchField"));
		System.out.println(request.getParameter("searchWord"));
		
		// 페이지 조회에 필요한 정보 수집, 시작번호와 끝번호를 계산해 올 수 있는 클래스 생성자.
		Criteria cri = new Criteria(request.getParameter("pageNo")
									, request.getParameter("amount")
									, request.getParameter("searchField")
									, request.getParameter("searchWord"));
		/*  위로 대체
		// 페이지 조회에 필요한 정보 수집.
		int pageNo = 1;	 	// 요청 페이지 번호	
		int amount = 10;	// 페이지당 게시물의 수 
		if(request.getParameter("pageNo") != null && !"".equals(request.getParameter("pageNo"))) {
			// 숫자로 변환 후 저장
			pageNo = Integer.parseInt(request.getParameter("pageNo"));
		}
		if(request.getParameter("amount") != null && !"".equals(request.getParameter("amount"))) {
			// 숫자로 변환 후 저장
			amount = Integer.parseInt(request.getParameter("amount"));
		}
		System.out.println("pageNo = " + pageNo);
		System.out.println("amount = " + amount);
		
		// 시작번호와 끝번호를 계산
		int endNum = pageNo * amount;
		int startNum = endNum - (amount-1);
		*/
		
		// 리스트 조회 후 리퀘스트 영역에 저장
		BoardDao dao = new BoardDao();
		request.setAttribute("list", dao.getList(cri));
		
		// 페이지 블럭을 생성하기 위해 필요한 정보를 저장
		//	cri : 요청페이지번호, 페이지당 게시물 수
		
		// 페이지 블럭을 생성하기 위해 필요한 정보를 저장
		// 조회조건을 세팅하지 않으면 조회되는 게시글의 건수와 페이지블럭이 다르게 표시될 수 있다.
		
		
		
		
		int totalCnt =dao.getTotalCnt(cri);
		PageDto pageDto = new PageDto(totalCnt, cri);
	
		request.setAttribute("pageDto", pageDto);
		
		
		// 페이지 전환 
		//  forward방식으로 전환하므로 request영역이 공유됨
		request.getRequestDispatcher("/06.session/servletEx/board.jsp").forward(request, response);
	}


}
