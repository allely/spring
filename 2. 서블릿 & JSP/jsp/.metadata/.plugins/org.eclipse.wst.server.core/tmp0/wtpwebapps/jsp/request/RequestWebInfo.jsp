<%@page import="com.me.vo.UserVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<ui>
	<li>데이터 전송 방식 : <%=request.getMethod() %></li>
	<li>URL : <%=request.getRequestURL()%></li>
	<li>프로토콜 : <%=request.getProtocol() %></li>
	<li>서버명 : <%=request.getServerName() %></li>
	<li>포트번호 : <%=request.getServerPort() %></li>
	<li>클라이언트 IP : <%=request.getRemoteAddr() %></li>
	<!-- 쿼리스링 : URL 뒤 "?이름=값&이름=값" 반환
				태그(요소)의 name속성 -->
	<li>쿼리스트링 : <%=request.getQueryString() %></li>	
	<li>파라메터 : <%=request.getParameter("eng") %></li>
	<li>파라메터 : <%=request.getParameter("han") %></li>
	
	<%
		UserVo user = new UserVo();
		out.print(request.getParameter("age"));	
	//	user.setAge(Integer.parseInt(request.getParameter("age")));	//age의 값이 없는데(null) 인트형으로 변환하려 하니 오류
		user.setName(request.getParameter("name"));
	%>
</ui>
</body>
</html>