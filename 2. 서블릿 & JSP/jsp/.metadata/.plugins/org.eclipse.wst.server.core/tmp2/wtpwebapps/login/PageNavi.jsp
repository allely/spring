<%@page import="com.login.dto.PageDto"%>
<%@page import="com.login.dto.Criteria"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
</head>
<body>


<!-- 페이지네이션 -->
<!-- class를 추가하여 화면을 구성
	active : 현재 페이지를 활성화()
	disabled : 버튼의 비활성화 -->
	

<%
	PageDto pageDto = null;
	// 페이지네비게이션을 생성하기 위해 필요한 데이터
	if(request.getAttribute("pageDto") != null && !"".equals(request.getAttribute("pageDto"))){
		pageDto = (PageDto)request.getAttribute("pageDto");
		
		out.print("pageDto.getCri().getStartNo() : "+  pageDto.getCri().getStartNo());//2
	} else {
		pageDto = new PageDto(0, new Criteria());
	}
	

%>
<nav aria-label="...">
  <ul class="pagination">
  	
  	<!-- 이전 페이지 블럭으로 이동 -->
    <li class="page-item <%=pageDto.isPrev()?"":"disabled" %>">
      <a class="page-link" href="/list?pageNo=<%=pageDto.getStartNo()-1%>">Previous</a>
    </li>
    <!-- 이전 페이지 블럭으로 이동 끝 -->
    
    <!-- 페이지 버튼 시작 -->
    
    <%
    
   
    for(int i = pageDto.getCri().getStartNo(); i < pageDto.getCri().getEndNo(); i++){ %>
    <li class="page-item">
    	<a class="page-link <%=pageDto.getCri().getPageNo() == i ? "active " : "" %>" href="/list?pageNo=<%=i%>">
    	<%=i %>
    	</a>
    </li>
    <%} %>
    
    <!-- 다음 페이지 블럭으로 이동 시작 -->
    <li class="page-item <%=pageDto.isNext()?"":"disabled"%>">
      <a class="page-link" href="/list?pageNo=<%=pageDto.getEndNo()+1%>">Next</a>
    </li>
  </ul>
</nav>
<!-- 페이지네이션 끝 -->
 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
</body>
</html>