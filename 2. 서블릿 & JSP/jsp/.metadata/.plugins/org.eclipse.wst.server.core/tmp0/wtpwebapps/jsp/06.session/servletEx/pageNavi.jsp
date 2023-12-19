<%@page import="com.me.dto.PageDto"%>
<%@page import="com.me.dto.Criteria"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
	function goPage(pageNo){
		searchForm.pageNo.vaue = 0;
		searchForm.submit();
		
		
	}
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- 부트스트랩 CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">

<%/*	
	PageDto pageDto = null;
	if(request.getAttribute("pageDto") != null && !"".equals(request.getAttribute("pageDto"))){
		pageDto = (PageDto)request.getAttribute("pageDto");
	} else {
		pageDto = new PageDto(0, new Criteria());
	}
*/%>

</head>
<body>

<!-- 페이지 블럭을 출력하는 방법
	1. 요청 컨트롤러에서 pageDto를 request영역에 저장.
	2. pageNavi.jsp를 리스트 페이지 블럭을 출력하고 싶은 위치에 include.
	3. searchForm을 생성.
		pageNo 요소가 있어야 함.
 -->

<!-- 페이지네이션 -->
<nav aria-label="...">
  <ul class="pagination">
  
  	<!-- 앞으로 가기 버튼 시작, disabled : 비활성화 -->
    <li class='page-item ${pageDto.prev ? "" : "disabled" }'>
      <a class="page-link" onclick="goPage(${pageDto.startNo -1})">&laquo;</a>
    </li>
    <!-- 앞으로 가기 버튼 끝 -->
    
    <c:forEach begin="${pageDto.startNo }" end="${pageDto.endNo }" var="i">
	    <li class="page-item">
	    	<!-- href="..." 링크로 이동할 경우, 검색어가 유지되지 않는다. -->
	    	<!-- 검색어를 유지하기 위해 searchForm을 전송하는 goPage 함수를 생성. -->
	    	<!-- 링크를 함수호출로 변경, onClick이벤트가 발생하면 goPage()함수를 호출한다.
	    				함수의 파라메터로 페이지번호를 넣어주어야 한다. -->
	    	<a class="page-link ${pageDto.cri.pageNo eq i ? 'active' : '' }" 
	    		onclick="goPage(${i})">
	    		${i }
	    	</a>
	    </li>
    </c:forEach>

    <!-- 뒤로가기 버튼 시작 -->
    <li class='page-item ${pageDto.prev ? "" : "disabled" }'>
      <a class="page-link" onclick="goPage(${pageDto.endNo + 1 })">&raquo;</a>
    </li>
    <!-- 뒤로가기 버튼 끝 -->
    
  </ul>
</nav>

<!-- 부트스트랩 JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
</body>
</html>