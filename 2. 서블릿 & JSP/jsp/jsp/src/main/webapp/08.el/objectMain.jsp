<%@page import="com.me.utils.CookieManager"%>
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
	CookieManager.makeCookie(response, "elCookie", "표현언어출력", 100);

	out.print("elCookie : " + CookieManager.readCookie(request, "elCookie"));
%>
	<h3>쿠키 값 읽기</h3>
	elCookie : ${cookie.elCookie.value }
	
	<h3>HTTP 헤더 읽기</h3>
	<ul>
		<li>host : ${header.host }</li>
		<li>user-agent : ${header['user-agent'] }</li>
		<li>cookie : ${header.cookie } </li>
	</ul>
	
	<h3>컨텍스트 초기화 매개변수</h3>
	initParam : ${initParam.INIT_PARAM }
	initParam : ${initParam.driver }
	
	<h3>컨텍스트 루트 경로 읽기</h3>
	경로를 지정하기 위해 종종 사용된다! (루트경로에서는 내용이 없다.)
	${pageContext.request.contextPath }
</body>
</html>