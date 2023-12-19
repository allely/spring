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
??
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
			location.href='/06.session/servletEx/deleteProcess.jsp?num=${param.num}';
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
	
	<h2>게시글 상세보기 EL</h2>
<br>제목 : ${dto.title }
<br>내용 : ${dto.content }
<br>작성자 : ${dto.id }
<br>작성일 : ${dto.postdate }
<br>조회수 : ${dto.visitcount }

</body>
</html>