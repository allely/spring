<%@page import="com.me.utils.CookieManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.none {
		display:none
	}
	.w30 { width:30}
	
</style>
</head>
<body>
	<%
	String none = "none";
	String str = "안녕하세요";
	%>
<script type="text/javascript">
	'<%="none"%>');
	alert("none");
	alert("<%=none%>");
	alert(
	alert("안녕하세요");
	alert("<%=str%>");
	
	/*
	popup
	document.querySelector("선택자");
	* 선택자
		.클래스
		#아이디
		태그명
	*/
	window.onload = function(){
		// popupCookie 쿠키가 없으면 팝업을 화면에 출력
		<%
		String display = "none";
		if(!CookieManager.readCookie(request, "popupCookie").equals("Y")) {
			display = "block";
		}
		%>
		
		// 화면에 출력
		document.querySelector("#popup").style.display='<%=display%>';
	
	
		// 닫기버튼을 클릭하면 form 전송
		document.querySelector("#closeBtn").onclick = function() {
			
			// 닫기버튼이 클릭되었으면 체크박스가 체크되었는지 확인
			if(document.querySelector("input[id=inactiveToday]").checked) {
				// 서버에 페이지를 요청
				//popupForm.submit();
				
				// 오브젝트로 만들어줌
				fetch('cookieAction.jsp');
					}
				console.log('fetch를 이용하여 서버에 cookieAction.jsp페이지를 요청');
				
			} else {
				// 팝업창 닫기
				document.querySelector("#popup").style.display='block';
			}
				
		} else {
			// 팝업창 닫기
			document.querySelector("#popup").style.display='none';
		}
	}
</script>
	
	<h2>쿠키 - 팝업 연습</h2>
	<form action="cookiePopupMain.jsp" name="popupForm">
	<!-- 
		<%=none %> : 변수 선언 후에 사용 
		<%="none" %>
		태그에 속성을 정의할 때 홀따옴표 또는 쌍따옴표로 감싸주는 것은
		해당 속성의 값이 어디까지인지 정의하는 것
		
		class 속성에 값을 정의할 수 있는데, 여러 개 정의할 수 있다!
		class="none w30"
	-->
	<div id="popup" >
        <h2 align="center">공지사항 팝업입니다.</h2>
        <div align="right">
	        
	            <input type="checkbox" id="inactiveToday" name="inactiveToday" value="Y" checked/> 
	            하루 동안 열지 않음
	            <input type="button" value="닫기" id="closeBtn" /> 
	       
        </div>
    </div>
    </form>
</body>
</html>