<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>구구단</h2>
	<h3>스크립틀릿 이용한 구구단</h3>
	<%
	for(int dan = 2; dan < 10; dan++){
		
	%>
	===<%=dan %>단===<br>
	
	<%
		for(int i = 1; i <10; i++){
	%>
		<%=dan %> * <%=i %> = <%=dan * i %><br>
	<%
		}
	}
	%>
	<hr>
	<h3>JSTL 사용한 구구단</h3>
	<c:forEach begin="2" end="9" var="dan">
		${dan }단<br>
		<c:forEach begin="1" end="9" var="i">
			${dan } * ${i } = ${dan * i}<br>	
		</c:forEach>
	
	</c:forEach>
</body>
</html>