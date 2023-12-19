<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
	#logo>nav>ul>li{
	
		float : left;	/* 가로로 출력하기 위해 float 속성을 사용 */
		width : 25%;
		height : 30px;
		list_style : none;
	}
	
	.floatClear{
		clear : both;
	}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<header id="logo">
	<nav>
		<ul>
			<li>Home</li>
			<li>Board</li>
			<li>Concat</li>
			<li>Map</li>
			<li>
				<form method="get" name="loginForm">
					<c:if test="${empty userId }">
							<button id="loginBtn">로그인</button>	
					</c:if>
					<c:if test="${not empty userId }">
						${userId }님 환영합니다.
						<button id="logoutBtn">로그아웃</button>
					</c:if>
				</form>
			</li>
		</ul>
	</nav>
</header>
</body>
</html>