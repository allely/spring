<%@page import="com.me.el.MyElClass"%>
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
	MyElClass myClass = new MyElClass();

	request.setAttribute("myClass", myClass);
%>
	<h3>객체를 영역에 저장 후 메서드 호출하기</h3>
	<p>el 표현언어에서 사용하기 위해서는 내장객체의 영역에 저장되어 있어야 한다!!</p>
<br>000000-1000000 : ${myClass.getGender("000000-1000000 ") }
<br>000000-2000000 : ${myClass.getGender("000000-2000000 ") }
<br>000000-3000000 : ${myClass.getGender("000000-3000000 ") }
<br>000000-4000000 : ${myClass.getGender("000000-4000000 ") }
<br>000000-5000000 : ${myClass.getGender("000000-5000000 ") }
<br>000000-6000000 : ${myClass.getGender("000000-6000000 ") }
<!-- getter 메서드를 이용해서 값을 출력하므로 메서드가 없다면 오류가 발생할 수 있다. -->
<br>gender : ${myClass.gender }
	
	<h3>정적에서도 호출하기</h3>
<%
	request.setAttribute("response", response);
%>
	response : ${response }
<br>${CookieManager.makeCookie(response, "myCookie", "el사용해봅시다.", 100) }

	<h3>메서드 호출하기</h3>
	${"123-123".replace("-","") }
	<!-- 오류표시는 있지만 실행은 된다. -->
</body>
</html>