package com.me.book.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.me.dao.FileDao;
import com.me.dto.FileDto;


@WebServlet("/upload/list")
public class UploadListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * 첨부파일으 목록을 조회하여 반환한다.
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 파일 목록을 조회
		FileDao dao = new FileDao();
		List<FileDto> list = dao.getList();
		dao.close();
		
		System.out.println(list);
		request.setAttribute("list", list);
		
		request.getRequestDispatcher("/10.upload/list.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
