<%@page import="com.me.dto.DeptDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>부서목록</h2>
	<%
	// jsp를 단독으로 실행할 경우, null이 출력될 수 있다
	//		전달받은 데이터가 없기 때문에.
	// 컨트롤러(서블릿) 실행
	List<DeptDto> list = (List<DeptDto>)request.getAttribute("list");
	out.print(list);	
	%>
</body>
</html>