<!-- 
	페이지 지시어 
	: JSP 페이지를 자바(서블릿) 코드로 변환하는 데 필요한 정보를 JSP 엔진에 알려주며,
	주로 스크립트 언어나 인코딩 방식 등을 설정
	*페이지 지시어가 없는 경우, 오류가 발생
	
	속성 = 값
	language = "java" 
-->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.util.Date" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HelloJSP</title>
</head>
<body>
<!-- jsp 파일 호출 방법
	localhost:포트/path/파일이름 
	* 웰컴페이지 확인하기!!
	
	servlet 호출 방법
	localhos:포트/path/매핑주소-->
	

<!-- java 코드를 사용하는 방법 -->
<!-- ! : 선언 -->
<%!	// 선언부	
	String title = "hello JSP";
%>

<!-- 하나의 값 출력 -->
<h1><%= title %></h1>
<hr>

<!-- 내장객체를 이용한 출력 -->
<h1>
<%
	out.print(title + "학습");
%>
</h1>

<%
	// 자바코드를 입력하기 위해 스크립트를 열어준다
	
	// 외부 클래스 사용 위해 page지시어 import 속성 이용!
	Date today = new Date();

	// 웹 브라우저에 출력하기 위한 내장 객체
	// 내장 객체 : 생성하지 않았지만 
	//		jsp가 클래스로 변환 시 자동으로 생성해주는 객체
	//		- out : 웹 브라우저에 출력하기 위한 내장객체
	out.print("오늘 날짜 : " + today);
%>
<hr>
오늘날짜 : <%= today %>
</body>
</html>