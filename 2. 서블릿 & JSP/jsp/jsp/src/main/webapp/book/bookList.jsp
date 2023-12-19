<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">

<style type="text/css">
	.pointer {
		cursor: pointer;
	}


</style>

<script type="text/javascript">
	window.onload = function() {
		// 요소 선택
		let regBtn = document.querySelector("#regBtn");
		
		// 이벤트 부여
		regBtn.addEventListener('click', function(){
			location.href = "/book/reg.jsp";
		});
		
		searchBtn.addEventListener('click', function(){
			searchForm.action = "/book/bookList";
			searchForm.submit();
		})
	}
	
/*
	스크립트에서 함수 정의하는 방법
	function 함수명(파람0, 파람, ...);
*/
	function goview(no){
		location.href="/view?no=" + no;
	}
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@include file="/header.jsp" %>
	<!--  header 외부파일 인클루드 -->
	
	
	<!-- 도서목록을 출력한다. -->
	<h2>도서목록</h2>
	<!-- Content Wrapper -->
	<div id="content-wrapper" class="d-flex flex-column">

		<!-- 메인컨텐츠 영역 -->
		<!-- Begin Page Content -->
		<div class="container-fluid">

			<!-- Topbar Search -->
			<br>

			<!-- DataTales Example -->
			<div class="card shadow mb-4">
				<div class="card-header py-3">
					<h6 class="m-0 font-weight-bold text-primary">도서목록</h6>
				</div>
			<!-- form submit()
				폼이 가지고 있는 요소를 파라메터로 서버에 요청(action)을 하는 것
				(action)에 등록되어 있지 않은 경우 현재 페이지를 다시 요청함) -->
			<form name="searchForm" action="/book/bookList"
				class="d-none d-sm-inline-block form-inline mr-auto ml-md-3 my-2 my-md-0 mw-100 navbar-search">
				<%--
				pageNo : <input type="text" name="pageNo" value="${pageDto.cri.pageNo }"> 
				num : <input type="text" name="num" value=""> 
				amount : <input type="text"	name="amount" value="10">
				 --%>
				<div class="input-group">
					<select class="form-select" name="searchField"
						id="inputGroupSelect04"
						aria-label="Example select with button addon">
						<option selected disabled>선택</option>
						<!-- 선택된 요소의 value값이 서버로 넘어간다. -->
						<option value="title"
							${pageDto.cri.searchField eq 'title' ? 'selected' : ""}>제목</option>
						<option value="id"
							${pageDto.cri.searchField eq 'id' ? 'selected' : ""}>작성자</option>
						<option value="content"
							${pageDto.cri.searchField eq 'content' ? 'selected' : ""}>내용</option>
					</select> <input type="text" name="searchWord" class="form-control"
						aria-label="Text input with dropdown button">
					<button class="btn btn-outline-secondary" type="submit" id="searchBtn">검색</button>
				</div>
			</form>
		
				
				<div class="card-body">
					<button type="button" class="btn btn-dark" id="regBtn">도서등록</button>
					<div class="table-responsive">
						<table class="table table-bordered" width="100%" cellspacing="0">
							<thead>
								<tr>
									<th>번호</th>
									<th>제목</th>
									<th>저자</th>
									<th>대여여부</th>
								</tr>
							</thead>
							<tbody>

								<!-- 리스트가 비어있으면 메세지 출력 -->
								<c:if test="${empty list }" var="res">
									<tr>
										<td colspan="4">도서목록이 존재하지 않습니다.</td>
									</tr>
								</c:if>

								<!-- 리스트가 비어있지 않다면 도서목록 출력 -->
								<c:if test="${not res }">
									<c:forEach items="${list }" var="bookDto">
										<tr>
											<td>${bookDto.num }</td>
											<td class="pointer" onclick="goview(${bookDto.num})">${bookDto.title }</td>
											<td>${bookDto.author }</td>
											<!-- Y/N => 대여가능/대여중 -->
											<td>${bookDto.rentynStr }</td>
										</tr>
									</c:forEach>

								</c:if>
							</tbody>
						</table>
						<!-- pageDto가 reqeust영역에 저정되어 있으면  -->
						<%@include file="/06.session/servletEx/pageNavi.jsp"%>
					</div>
				</div>
			</div>

		</div>
		<!-- /.container-fluid -->

		<!-- 메인컨텐츠 영역 끝 -->

	</div>
	<!-- End of Main Content -->
	<!--  footer 외부파일 인클루드 -->
	<%@include file="/footer.jsp"%>
	<!-- 부트스트랩 js -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
		crossorigin="anonymous"></script>
</body>
</html>