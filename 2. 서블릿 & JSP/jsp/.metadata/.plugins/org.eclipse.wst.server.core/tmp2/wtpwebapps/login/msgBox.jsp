<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 메세지 출력 후 다른 페이지로 이동 -->
<script type="text/javascript">
	alert('<%=request.getAttribute("msg") %>');
	// 만약 url에 값이 있다면 url 요청(location.href=url)
	let url = '<%=request.getAttribute("url")%>'
	if(url != ''){
		location.href = url;
	} else{
		history.back();
	}
</script>
</body>
</html>