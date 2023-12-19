<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>파일목록</h2>
	<table border>
			<tr>
				<th>파일번호</th>
				<th>제목</th>
				<th>아이디</th>
				<th>카테고리</th>
				<th>원본파일명</th>
				<th>저장파일명</th>
				<th>등록일</th>
			</tr>
		<c:forEach items="${list}" var="fileDto" >
			<tr>
				<td>${fileDto.file_no }</td>
				<td>${fileDto.name }</td>
				<td>${fileDto.title }</td>
				<td>${fileDto.cate }</td>
				<td>${fileDto.ofile }</td>
				<td>${fileDto.sfile }</td>
				<td>${fileDto.postdate }</td>
			
			</tr>
		</c:forEach>
	</table>
	
	<!-- ofile : 원본파일명
		 sfile : 저장된 파일명 
	-->
	<a href="filedownload.jsp?ofile=스크린샷 2023-11-27 151753.png&sfile=스크린샷 2023-11-27 151753.png">
		파일명(링크 - ofile)
	</a>
	
</body>
</html>