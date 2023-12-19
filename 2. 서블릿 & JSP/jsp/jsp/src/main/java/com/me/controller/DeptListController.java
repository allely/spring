package com.me.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.me.dao.DeptDao;
import com.me.dto.DeptDto;

/**
 * URL매핑('/deptList' 페이지를 요청하면 실행)
 *  - 요청 메소드에 따라서 실행되는 메소드가 결정
 *  
 *  주소표시줄, 링크 -> get방식 -> doGet() 메서드 호출
 *  
 *  Controller
 *   - 사용자의 요청 정보를 수집
 *   - 비지니스로직 호출
 *   - VIew로 페이지 전환 (forward or redirect 방식으로)
 */
@WebServlet("/deptList")	
public class DeptListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DeptListController() {
        super(); 
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		// DB에 접근해서 리스트를 조회
		DeptDao dao = new DeptDao(request.getServletContext());
		List<DeptDto> list = dao.getList();
		
		request.setAttribute("list", list);
		// Controller에서 하면을 구성하는 태그를 잘성하는 것은
		//	매우 번거롭기 때문에 JSP를 이용해서 화면을 작성 후 페이지 전환한다.
		request.getRequestDispatcher("deptList.jsp").forward(request, response);
		
		
		PrintWriter out = response.getWriter();
		out.print("<h2>안녕하세요</h2>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}
}
