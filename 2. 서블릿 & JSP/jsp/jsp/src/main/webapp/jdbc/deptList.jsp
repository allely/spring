<%@page import="com.me.dto.DeptDto"%>
<%@page import="java.util.List"%>
<%@page import="com.me.dao.DeptDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	DeptDao dao = new DeptDao(application);
	List<DeptDto> list = dao.getList();
	// 자원 해제
	dao.close();
	
	for(DeptDto dto : list){
		out.print(dto.getDept_title() + " ");
		
		out.print(dto.getLocal_code() + " ");
		
		out.print(dto.getLocation_id() + " ");
		
		out.print(dto.getLocal_name() + "<br>");
		
	}
%>
</body>
</html>