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
	// id 쿠키에서 찾는다!
	// 요청객체로부터 쿠키정보를 꺼내서 id값을 변수에 저장한다.
	Cookie[] cookies = request.getCookies();
	
	String id ="";	//id값을 저장할 변수 => input의 id value값에 넣는다.
	String checked = "";	// 체크박스 상태 변수 
	
	id = CookieManager.readCookie(request, "id");
	checked = !"".equals(id)? "checked" : "";
	
	/* 위의 두 줄로 대체
	if(cookies !=null){
		for(Cookie cookie : cookies){
			if(cookie.getName().equals("id")) {	// 쿠키에 id가 저장되어 있으면
				id = cookie.getValue();	// 쿠키의 id값을 id변수에 저장해 input태그에 넣는다.
				checked = "checked";	// 체크박스가 체크되어야 => 쿠키에 id값 저장된다. 
										//   (id값이 저장되어 있다는 것 = 체크박스 체크되어있다는 것)
										// 따라서 체크박스가 체크된 상태로 출력되게 한다.
				break;
			}
		}
	}
	*/
	%>
	<form action="loginAction.jsp" method="post">
		<div class='loginbox'>
	        <div id='login'>
	            <input type="text" name="id" id="userid" placeholder='ID를 입력해주세요.' 
	            				required="required" value="<%=id%>"><br>
	            				
	            <input type="password" name="pw" id="userpw" placeholder='PW를 입력해주세요.' required="required"><br>
	            <input type="checkbox" <%=checked %> name="save_check" value="Y">아이디 저장하기<br>
	        </div>
	        <div id='button'>
	        <input type="submit" value="로그인">
	        </div>
	    </div>
	    <div id='info'>
	        <a href="">회원가입</a>
	        <a href="">ID찾기</a>
	        <a href="">PW찾기</a>
	    </div> 
    </form>
</body>
</html>