<%@page import="com.me.utils.CookieManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
    div#popup {
        position: absolute; top:100px; left:50px; color:yellow;  
        width:270px; height:100px; background-color:gray;
    }
    div#popup>div {
        position: relative; background-color:#ffffff; top:0px;
        border:1px solid gray; padding:10px; color:black;
    }
</style> 
</head>
<body>
	<h2>쿠키를 이용한 팝업창 제어 ver 1.0</h2>
	<!-- script 화면(요소)의 동적인 제어 -->
	<script>
		// window 객체의 onload 이벤트가 발생하면 실행
		// 		(html 요소가 모두 생성된 상태에서 실행한다는 뜻)
		// 페이지에 적힌 순서대로 실행되기 때문에 
		//		window.onload로 감싸주지 않으면 버튼을 찾지 못해 실행할 수 없다.
		//		아래 순서로 적는다면 실행할 수 있지만 보통 위에 적는다.
		window.onload = function() {
			
			// 팝업클로즈 쿠키의 값이'Y'이면 팝업창을 숨김처리
							
			// 버튼에 이벤트 추가	(버튼 id값 확인)
			//		addEvent-(?) 로도 추가할 수 있음
			
			closeBtn.onclick = function(){
				// if(inactiveToday.checked) {}로도 사용 가능하지만 아래의 방식을 쓰자.
				if(document.querySelector('#inactiveToday').checked) {				
					// or consol.log("")
					alert("체크박스 선택되었습니다.");
					
					// 서버에 요청 방법
					// 1. href : queryString을 이용해서 파라미터를 전달
					// 2. form submit : form안에 요소들을 가지고 이동
					popForm.submit();
								
				}				
				console.log("체크박스가 생성되지 않았습니다.");
				// display속성을 none으로 설정하면 화면에서 숨김처리
				popup.style.display="none";
				// checkbox가 체크되어있다면 쿠키를 생성하는 페이지 호출!
				
			}
		}
		
	</script>
	<!-- 
			1. 닫기 버튼을 클릭하면 cookiePopupAction.jsp 파일을 호출
				- 팝업닫힘 쿠키를 생성
			2. 팝업닫힘 쿠키가 생성이 되어있다면 더이상 팝업창을 보여주지 않도록 처리
	-->
	<form action="cookiePopupAction.jsp" name="popForm">
		<%
		// 쿠키의 저장된 popupClose의 값이 Y가 아니면 화면에 팝업을 생성
		if(!"Y".equals(CookieManager.readCookie(request, "popupClose"))){
			//document.querySelector("#popup").style.display = 'none';
		%>
		<div id="popup" >
	        <h2 align="center">공지사항 팝업입니다.</h2>
	        <div align="right">
	        										<!-- name 적어줘야 전달할수있다 -->
		    	<input type="checkbox" id="inactiveToday" name="inactiveToday" value="Y" checked/> 
		        	하루 동안 열지 않음
		        <input type="button" value="닫기" id="closeBtn" />		        
	        </div>
	    </div> 
	    <%	
		}
		 %>
    </form>
</body>
</html>