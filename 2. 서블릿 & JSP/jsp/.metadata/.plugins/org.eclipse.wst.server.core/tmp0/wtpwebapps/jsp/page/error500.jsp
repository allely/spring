<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="errorPage.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>page 지시어</title>
</head>
<body>

<%	
	try {
		int age = 0;
		// 변수 선언
		age = Integer.parseInt(request.getParameter("age"));
	
		out.print("나이 :" + age);
	} catch(Exception e) {
		out.print("오류 발생");
	}
%>

<hr>


<!-- age를 입력하지 않아 오류 발생
	url 뒤에 ?age=숫자 넣어주어 해결하거나 try ~ catch로 해결
 -->
</body>
</html>