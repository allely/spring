<%@page import="com.login.dto.BoardDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<script type="text/javascript">
	window.onload = function(){
		
		// 로그아웃버튼 처리
		let logoutBtn = document.querySelector("#logoutBtn");
		if(logoutBtn != null){
			logoutBtn.onclick = function(){
				// 로그아웃 처리 -> 로그인 페이지로 이동
				location.href="/logoutAction";
			}
		}
		
		// 로그인버튼 처리
		let loginBtn = document.querySelector("#loginBtn");
		if(loginBtn != null){
			loginBtn.addEventListener('click', function(){
				// 로그인 페이지로 이동
				location.href="/login.jsp";
		});
		}
	}
</script>
	<%
	if((session.getAttribute("id") != null)
		&& !"".equals(session.getAttribute("id".toString()))){
		// 로그인 사용자
		out.print(session.getAttribute("id".toString()) + "님 환영합니다.");
		out.print("<button id='logoutBtn' class='btn btn-primary'>로그아웃</button>");
	} else {
		// 로그인 전
		out.print("<button id='loginBtn' class='btn btn-primary'>로그인</button>");
	}
	%>

	<h2>게시글 목록 조회</h2>
	
	<table class="table justify-content-center">
  <thead>
    <tr>
      <th scope="col">번호</th>
      <th scope="col">제목</th>
      <th scope="col">작성자</th>
      <th scope="col">작성일</th>
    </tr>
  </thead>
  <tbody>
 <%
	if(request.getAttribute("list") == null){
		out.print("<td colspan='4'>게시물이 존재하지 않습니다.</td>");
	} else{
		List<BoardDto> list = (List<BoardDto>)request.getAttribute("list");
		for(BoardDto dto : list){
	%>
    	<tr>	
			<td><%=dto.getNum() %></td>
			<td><a href="/view?num=<%=dto.getNum() %>"><%=dto.getTitle() %></a></td>
			<td><%=dto.getId() %></td>
			<td><%=dto.getPostdate() %></td>
		</tr>
	<%	
		}
	}
	%>
  </tbody>
  
</table>

	
	<%@include file="PageNavi.jsp" %>
</body>
</html>