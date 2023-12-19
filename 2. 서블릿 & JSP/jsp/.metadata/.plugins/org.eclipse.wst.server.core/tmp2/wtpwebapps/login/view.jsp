<%@page import="com.login.dto.BoardDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<script>
	// 화면이 모두 불러지면 실행한다.
	window.onload = function(){
		// 뒤로가기 버튼
		let listBtn = document.querySelector("#listBtn");
		// 리스트 버튼이 화면에 존재하면 이벤트를 추가
		if(listBtn != null){
			listBtn.onclick = function(){
				// 리스트 페이지로 이동
				location.href="/list";
			}
		}
		// 수정 버튼 input text로 value값에 현재 값 넣어주고 수정, 저장할 수 있도록
		//	sql??
		let editBtn = document.querySelector("#editBtn");
		if(editBtn != null){
			editBtn.onclick = function(){
				location.href="";
			}
		}
		// 삭제 버튼 클릭하면 '정말 삭제하시겠습니까?' 확인 후'
		// 삭제컨트롤러를 호출
		// 삭제 성공 -> 리스트페이지 호출
		// 삭제 실패 -> '삭제 중 예외가 발생되었습니다.' 메시지 후 -> 상세페이지
		let deleteBtn = document.querySelector("#deleteBtn");
		if(deleteBtn != null){
			deleteBtn.addEventListener('click', function(){
				deleteFnc();
				
				/* 함수를 따로 정의하여 위처럼 사용할 수 있다.
				// confirm : 확인/취소 버튼으로 true/false 반환
				// 확인버튼을 클릭하면 삭제컨트롤러 요청
				if (confirm('정말 삭제하시겠습니까?')){
					viewForm.action='/delete';
					viewForm.submit();
				}
				*/
			});
		}
	}
	// 게시글을 삭제한다.
	function deleteFnc(){
		// confirm : 확인/취소 버튼으로 true/false 반환
		// 확인버튼을 클릭하면 삭제컨트롤러 요청
		if (confirm('정말 삭제하시겠습니까?')){
			viewForm.action='/delete';
			viewForm.submit();
		}
	}
</script>	
	
	<h2>상세보기</h2>
	요청 게시글 번호 : <%=request.getParameter("num") %>
	<br>boardDto : <%=request.getAttribute("dto") %>
	<br>
	
	
	<button id="listBtn">리스트</button>
	
	<form method="post" name="viewForm">
		<input type="hidden" name="num" value="<%=request.getParameter("num") %>">
	</form>
	<!-- 글의 작성자만 수정, 삭제가 가능
		게시글의 id가 로그인한 id와 동일하다면 수정, 삭제 버튼 보여주기 -->
		
	
		
	<%
	if(request.getAttribute("dto") != null) {
		BoardDto dto = (BoardDto)request.getAttribute("dto");
		String userId = "";
		if(session.getAttribute("id") != null){
			userId = session.getAttribute("id").toString();
			if(dto.getId().equals(userId)){
			out.print("<button id='editBtn'>수정</button>");
			out.print("<button id='deleteBtn'>삭제</button>");
			}
		}
		
	%>
	<ul>
		<li>제목 : <%=dto.getTitle() %></li>
		<li>내용 : <%=dto.getContent() %></li>
		<li>작성자 : <%=dto.getId() %></li>
		<li>작성일 : <%=dto.getPostdate() %></li>
		<li>조회수 : <%=dto.getVisitcount() %></li>		
	</ul>
	<%} %>
</body>
</html>