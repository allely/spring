<%@page import="com.me.dto.BoardDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/boardList" name="searchForm">
		num : <input type="text" name="name" value="${param.num }">
		pageNo : <input type="text" name="pageNo" value="${param.pageNo }">
		searchWord : <input type="text" name="pageNo" value="${param.searchWord }">
		searchField : <input type="text" name="" value="${param.searchField }">
	</form>
<script type="text/javascript">
	window.onload = function(){
		// 버튼을 클릭하면 리스트 페이지로 이동
		listBtn.onclick = function() {	//or addEventListener (현재 더 많이 사용)
			location.href='/boardList';
		}
		// 버튼을 클릭하면 수정 페이지로 이동
		deleteBtn.addEventListener('click', () => {
			// jsp를 단독으로 실행할 경우, 경로문제가 발생하지 않는다.
			// 	같은 경로에 있기 때문에
			// 하지만 서블릿을 통해 들어오는 경우, 경로 문제가 발생할 수 있다.
			// 그래서 루트경로로부터 풀 경로를 적어주는 것이 오류가 발생하지 않도록 하는 방법이다.
			location.href='/06.session/servletEx/deleteProcess.jsp?num=<%=request.getParameter("num")%>';
		});
		// 버튼을 클릭하면 삭제(Y/N) 클릭 후 정보 삭제
		editBtn.onclick = function(){
			
		}
	}
</script>
	<h2>게시글 상세보기</h2>
	<button id="listBtn">리스트로 이동</button>
	<button id="editBtn">수정</button>
	<button id="deleteBtn">삭제</button>
<%	
	if(request.getAttribute("dto") != null) {
		BoardDto dto = (BoardDto)request.getAttribute("dto");
%>
	<h2>게시글 상세보기</h2>
<br>제목 : <%=dto.getTitle() %>
<br>내용 : <%=dto.getContent() %>
<br>작성자 : <%=dto.getId() %>
<br>작성일 : <%=dto.getPostdate() %>
<br>조회수 : <%=dto.getVisitcount() %>
<%	} %>
</body>
</html>