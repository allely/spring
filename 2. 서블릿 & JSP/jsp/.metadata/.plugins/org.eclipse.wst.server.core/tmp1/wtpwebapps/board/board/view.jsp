<%@page import="com.board.dto.BoardDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>상세 페이지</h2>
	<p>BoardDto : 한 건의 게시글 정보</p>
	<p>jsp를 단독으로 실행할 경우,
		request영역에 BoardDto를 저장하지 않으므로 게시글의 정보가 출력되지 않는다.</p>
		
	num : <%=request.getParameter("num") %>
	dto : <%=request.getAttribute("dto") %>
	<br>
	<%
	if(request.getAttribute("dto") != null)	{
		BoardDto dto = (BoardDto)request.getAttribute("dto");
	%>
	<br>번호 : <%=request.getParameter("num") %>
	<br>제목 : <%=dto.getTitle()%>
	<br>내용 : <%=dto.getContent() %>
	<br>작성자 : <%=dto.getId() %>
	<br>작성일 : <%=dto.getPostdate() %>
	<br>조회수 : <%=dto.getVisitcount() %>
	
	<%} %>
</body>
</html>