<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- id  : me / pw : 1234 이면 loginOK페이지로 전환
		아니면 오류 메세지를 출력할 수 있도록 main페이지로 파라메터를 전달 -->
	<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
	if ("me".equals(id) && "1234".equals(pw)) {
		// request 영역이 공유가 되지 않음
		// 웹브라우저로 다른 페이지를 요청할 수 있도록 처리
		// 2번의 요청이 발생
		response.sendRedirect("loginOK.jsp?id=" + request.getParameter("id"));
	} else {
		// 1번의 요청으로 페이지를 전환하므로 request영역이 공유가 된다.
		request.getRequestDispatcher("main.jsp?loginErr=1").forward(request, response);
	}
	%>
</body>
</html>