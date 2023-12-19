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
	pageContext.setAttribute("pageValue", "페이지 영역");
	request.setAttribute("requestValue", "요청영역");
	session.setAttribute("sessionValue", "세션 영역");
	application.setAttribute("applicationValue", "어플리케이션 영역");
%>
	<h2>각 영역에 저장된 속성 읽기</h2>
	${pageScope.pageScope }
<br>표현법 : <%=request.getAttribute("requestValue") %>
<br>표현 언어 : ${requestScope.requestValue } 
			/${requestValue }	
			
	<hr>
	<ul>
		<li>페이지 영역 : ${pageScope.pageValue } </li>
		<li>요청 영역 : ${requestScope.requestValue } </li>
		<li>세션 영역 : ${sessionValue } </li>
		<li>어플리케이션 영역 : ${applicationValue }</li>
	
	</ul>
	<jsp:forward page="elForward.jsp"></jsp:forward>
</body>
</html>