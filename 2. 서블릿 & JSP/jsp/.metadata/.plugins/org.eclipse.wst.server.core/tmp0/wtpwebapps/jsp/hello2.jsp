<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 선언부 -->
<%! 
	String str = "Java Server Page";
	// 접근제한자 반환타입 메서드명(매개변수타입 매개변수명)
	public int add(int num1, int num2) {
		return num1 + num2;
	}
%>
<h1><%= str %></h1>
<h2><%= add(1,10) %></h2>

</body>
</html>