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
<!-- 
	팝업을 쿠키로 생성 후 cookieMain 페이지로 전환
 -->
 	<%
 	if("Y".equals(request.getParameter("inactiveToday"))){
 		
 		// 쿠키에 저장
 		// 서버에서는 response(응답객체)에 쿠키를 추가해주면 브라우저가 확인 후 쿠키 저장
 		CookieManager.makeCookie(response, "popupcookie", "Y", 3600);
 		
 		//방법1
 		response.sendRedirect("cookieMain.jsp");
 		//방법2
 		//request.getRequestDispatcher("cookieMain").forward(request, response);
 	}
 	 %>
</body>
</html>