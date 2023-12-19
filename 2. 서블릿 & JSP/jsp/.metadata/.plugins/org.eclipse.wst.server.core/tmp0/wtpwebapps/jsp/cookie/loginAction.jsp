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
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
	// 체크박스는 값이 선택된 경우에만 넘어온다!
	// 체크박스 값 수집
	String save_check = request.getParameter("save_check");
	
	out.print("save_check : " + save_check);
	
	// save_check값이 null이 아니라면
	if(save_check != null){
		// 쿠키에 아이디를 저장한다.	
		
		CookieManager.makeCookie(response, "id", id, 3600);
		
		/* 위의 클래스함수로 대체
		Cookie cookie = new Cookie("id",id);
		cookie.setMaxAge(3600);
		response.addCookie(cookie);
		out.print("아이디를 쿠키에 저장했습니다.");
		*/
	}
	
	if("me".equals(id) && "1234".equals(pw)) {
		out.print("로그인 성공");
	} else {
		// String 사용해서 출력
		String script = "<script type='text/javascript'>"
				+ "alert('id/pw를 확인해주세요');"
				+ "history.go(-1);"
				+ "</script>";
		out.print(script);
	
	%>
	<!-- script 사용해서 출력하는 방법 
	<script type="text/javascript">
		alert('id/pw를 확인해주세요');
		history.go(-1);
	</script>
	-->
	<% 
	}
	%>
</body>
</html>