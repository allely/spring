<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내장객체 - request</title>
</head>
<body>
<h2>1. 클라이언트 서버의 환경정보 읽기</h2>
<!-- method를 지정하지 않은 경우 get방식으로 호출(기본값)!!! -->

<p>
	<a href = "RequestWebInfo.jsp?eng=Hello&han=안녕">GET 방식 요청</a>
</p>

<h2>2. 클라이언트 요청 매개변수 읽기</h2>
	<form action="RequestParameter.jsp" method="get">
		아이디 : <input type="text" name="id">
		<br>
		성별 : <input type="radio" name="sex" value="man">남
			<input type="radio" name="sex" value="women" checked="checked">여
		<br>
		관심사항 : <input type="checkbox" name="favo" value="eco">경제
				<input type="checkbox" name="favo" value="pol">정치
				<input type="checkbox" name="favo" value="ent">연예
		<br>
		자기소개 : <textarea rows="4" cols="30" name="intro">
만나서 반갑습니다.
잘부탁드려요~

				</textarea>
		<br>
		<!-- 폼에 버튼이 하나만 있는 경우 SUBMIT 버튼처럼 동작 -->
		<button>전송</button>
	</form>
	
	<h2>3. HTTP 요청 헤더 정보 읽기</h2>
	<a href = "requestHeader.jsp">요청 헤더 정보 읽기</a>



</body>
</html>