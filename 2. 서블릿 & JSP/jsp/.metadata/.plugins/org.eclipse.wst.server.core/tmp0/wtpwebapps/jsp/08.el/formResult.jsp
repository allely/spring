<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>폼 값 출력</h2>
	<p>표현식을 이용한 출력</p>
<br>이름 : <%=request.getParameter("name") %>
<br>성별 : <%=request.getParameter("gender") %>
<br>학력 : <%=request.getParameter("grade") %>
<br>취미 : <%=request.getParameterValues("inter") %>
		

	<p>el을 이용한 출력</p>
<br>이름 : ${param.name }
<br>성별 : ${param.gender }
<br>학력 : ${param.grade }
<br>취미 : ${paramValues.inter }
		 ${paramValues.inter[0] }
		 ${paramValues.inter[1] }
		 ${paramValues.inter[2] }
		 ${paramValues.inter[3] }
</body>
</html>