<%@page import="com.me.dto.Criteria"%>
<%@page import="com.me.dto.BoardDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript">
	window.onload = function() {
		let logoutBtn = document.querySelector("#logoutBtn");
		if(logoutBtn != null) {
			logoutBtn.onclick = function() {
				loginForm.action = "/logout";
				loginForm.submit();
			}
		}
		let loginBtn = document.querySelector("#loginBtn");
		if(loginBtn != null){
			loginBtn.addEventListener('click', function() {
				loginForm.action = "/06.session/servletEx/loginForm.jsp";
				loginForm.submit();
			});
		}
	
	}
	
	// 함수는 onload함수 외부에 작성한다!!
	/**
	 * 입력받은 페이지 번호로 이동한다.
	 */
	function goPage(pageNo){
		alert('goPage');
		searchForm.action = '/boardList';
		searchForm.pageNo.value = pageNo;
		searchForm.submit();
	}
	
	function goDetail(num){
		alert('goDetail');
		// 파라메터로 넘어온 페이지 번호를 searchForm에 pageNo에 입력
		searchForm.action = '/boardRead';
		searchForm.num.value = num;
		searchForm.submit();
	}
	
	function formSubmit(){
		// 1. 폼을 선택 - 폼의 이름을 부른다.
		// 2. 폼의 요소를 선택 - 폼.요소이름
		searchForm.pageNo.value = '페이지 번호';
		// 3. 폼 전송하기 - form의 action속성에 정의된 url을 호출한다.
		//			  - 폼 안의 요소들을 파라메터로 전달 
		searchForm.submit();
	}
</script>
<body>

<!-- 로그인/로그아웃 링크 보여주기 
	세션에 userId가 null이 아니라면 로그아웃 종료, 아니면 로그인 링크를 화면에 출력	
-->

	<%@include file="header.jsp" %>	
	
	<h2>게시글 목록</h2>
	<table width="90%" align="center">
		<tr>
			<td>
			
			
	<!-- 검색폼 
	pageDto : ${pageDto }
	<br>cri : ${pageDto.cri }
	<br>pageNo : ${pageDto.cri.pageNo }
	<br>searchField : ${pageDto.cri.searchField }
	<br>searchWord : ${pageDto.cri.searchWord }-->
	
	<form name="searchForm">
		pageNo : <input type="text" name="pageNo" value="${pageDto.cri.pageNo }">
		num : <input type="text" name="num" value="">
		<div class="input-group">
	  		<select class="form-select" name="searchField" id="inputGroupSelect04" aria-label="Example select with button addon">
			    <option selected disabled>선택</option>
			    <!-- 선택된 요소의 value값이 서버로 넘어간다. -->
			    <option value="title" 
			    	${pageDto.cri.searchField eq 'title' ? 'selected' : ""}>제목</option>
			    <option value="id"
			    	${pageDto.cri.searchField eq 'id' ? 'selected' : ""}>작성자</option>
			    <option value="content"
			    	${pageDto.cri.searchField eq 'content' ? 'selected' : ""}>내용</option>
		  	</select>
		  	<input type="text" name="searchWord" class="form-control" aria-label="Text input with dropdown button">
	  		<button class="btn btn-outline-secondary" type="submit">입력</button>
		</div>
	</form>
	
	<h2>게시판</h2>
	

		<!-- 변수를 4가지 영역 중 한곳에 저장 -->
	<hr>
	<h4>JSTL, el을 이용한 테이블 출력</h4>
	<table border="1" class="table">
		<thead>
		<tr>
			<th>일련번호</th>
			<th>제목</th>
			<th>내용</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>조회수</th>
		</tr>
		</thead>
		
		<tbody>
		<!-- 만약 리스트의 사이즈가 0이라면 조회된 데이터가 없습니다. 를 출력 -->
		<!-- 만약 리스트의 사이즈가 0이 아니면 목록을 출력 -->
		<c:if test="${empty list }" var="result" >
			<tr><td colspan="6">조회된 데이터가 존재하지 않습니다.</td></tr>
		</c:if>
		
		
		<c:forEach items="${list }" var="boardDto">
			<tr>
				<td>${boardDto.num }</td>	
				<td><a onclick="goDetail(${boardDto.num })"> ${boardDto.title }</a></td>
				<td>${boardDto.content }</td>
				<td>${boardDto.id }</td>
				<td>${boardDto.postdate }</td>
				<td>${boardDto.visitcount }</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>	
	<!-- pageNavi include -->
	<%@include file="pageNavi.jsp" %>
			</td>
		</tr>	
	</table>
	
	<%--
 	<hr>
	<!-- 로그인/로그아웃 링크 보여주기 
	세션에 userId가 null이 아니라면 로그아웃 종료, 아니면 로그인 링크를 화면에 출력	
	-->
	<form name="loginForm">
	<%	Object userId = session.getAttribute("userId");
		if(userId != null && !"".equals(userId)) {	%>
	<%=		session.getAttribute("userId") %>님 환영합니다.
			<button id="logoutBtn">로그아웃</button>
	<%	} else {%>
		<button id="loginBtn">로그인</button>
	<% 	}%>
	
	<h4>request영역에서 getAttribute로 테이블 출력</h4>
	<table border="1">
		<tr>
			<th>일련번호</th>
			<th>제목</th>
			<th>내용</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>조회수</th>
		</tr>
		
		<%
		if(request.getAttribute("list") != null) {
			List<BoardDto> list = (List<BoardDto>)request.getAttribute("list");
			for(BoardDto dto : list){
		%>
			<tr>
				<td><%=dto.getNum() %></th>
				<td><a href="/boardRead?num=<%=dto.getNum()%>"><%=dto.getTitle() %></a></th>
				<td><%=dto.getContent() %></th>
				<td><%=dto.getId() %></th>
				<td><%=dto.getPostdate() %></th>
				<td><%=dto.getVisitcount() %></th>
			</tr>	
								
		<%
			}
		}
		%>
	</table>
	 --%>
	
	
	<%/*
	<!-- 페이지 내비게이션 작성 
	- 페이지 번호 : pageNo
	- 페이블럭당 페이지 수 : ???
		=> 페이지 블럭의 시작번호 - 페이지 블럭의 끝번호
	- 총 게시물의 수 : totalCnt
	- 페이지당 게시물의 수 : amount
		=> 진짜 블럭의 끝번호
	-->
	
	out.print("<br>페이지블럭 시작==================<br>");
	
	int startNo = 0;
	int endNo = 0;
	
	// 연산을 위해서(올림처리 위해) double타입으로 선언
	// java에서 int/int = int
	double pagePerBlock = 10.0;
	
	Criteria cri = new Criteria();
	int totalCnt = 0;
	if(request.getAttribute("cri") != null && !"".equals(request.getAttribute("cri"))){
		cri = (Criteria)request.getAttribute("cri");
		out.print("<br>요청페이지번호 - pageNo : " + cri.getPageNo());
		out.print("<br>페이지당 게시물수 - amount : " + cri.getAmount());
	}
	if(request.getAttribute("totalCnt") != null && !"".equals(request.getAttribute("totalCnt"))){
		totalCnt = Integer.parseInt(request.getAttribute("totalCnt").toString());
		out.print("<br>총 게시물의 수 - totalCnt : " + totalCnt + "<br>");
	}
	
	// 페이지 블럭의 시작 번호와 끝번호 구하기
	// 끝번호 구하기
	// 7페이지 요청 : 올림(7/10.0) * 10
	// 11페이지 요청 : 올림(11/10.0) * 10
	endNo = (int)(Math.ceil( cri.getPageNo() / pagePerBlock ) * pagePerBlock);
	startNo = endNo - (int)(pagePerBlock -1);
	
	// 페이지 블럭을 생성
	for(int i = startNo; i <= endNo; i++){
		out.print("<a href='/boardList?pageNo=" + i + "'>" + i +  "</a> ");
	}
	*/%>
	
</body>
</html>