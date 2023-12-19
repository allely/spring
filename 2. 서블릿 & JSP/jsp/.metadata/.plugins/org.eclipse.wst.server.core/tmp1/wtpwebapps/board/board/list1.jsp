<%@page import="com.board.dto.BoardDto"%>
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
	<h2>목록 조회</h2>
	<table border="1">
		<tr>
			<th>제목</th>
			<th>작성자</th>
			<th>등록일</th>
		</tr>
	<%
	List<BoardDto> list = (List<BoardDto>)request.getAttribute("list");
	if(list != null) {
		for(BoardDto dto : list){
		%>
			<tr>
				<td><%=dto.getTitle() %></td>
				<td><%=dto.getId() %></td>
				<td><%=dto.getPostdate() %></td>
			</tr>
		<%
		}
	} else{
		out.print("<tr><td colspan='3'>조회된 객체가 없습니다.</td></tr>");
	}
	%>
	</table>
</body>
</html>