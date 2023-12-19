package com.me.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.me.dao.EmpDao;
import com.me.dto.EmpDto;


@WebServlet("/empList")
public class EmpListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	protected void doGet(HttpServletRequest request
						, HttpServletResponse response) 
							throws ServletException, IOException {
		
		//사원 리스트 조회
		//EmpDao dao = new EmpDao(request.getServletContext());
		EmpDao dao = new EmpDao();
		List<EmpDto> list = dao.getList();
		
		//리스트를 request영역에 저장
		request.setAttribute("list", list);
		
		// view 페이지 이동
		request
			.getRequestDispatcher("/jdbc/empList.jsp")
			.forward(request, response);
	}
}