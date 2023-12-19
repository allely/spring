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
				<!-- 제목을 클릭하면 상세보기 화면으로 이동한다.
					 이동 시에 번호를 갖고 간다.-->
				<td><a href="/board/boardView?num=<%=dto.getNum()%>"><%=dto.getTitle() %></a></td>
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