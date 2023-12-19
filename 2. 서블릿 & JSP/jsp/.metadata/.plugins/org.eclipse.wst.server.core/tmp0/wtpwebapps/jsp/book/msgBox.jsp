<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 메세지 출력 후 다른 페이지를 요청하거나 뒤로가기. -->
<script type="text/javascript">
	// 서버로부터 전달받은 메세지를 출력한다.
	let msg = '${msg}';
	if(msg != '') {
		alert(msg);
	}
	
	// 만약 url에 값이 있다면 url요청
	let url = '${url}';
	if(url != ''){
		location.href = url;
	} else {
		history.go(-1);
	}
</script>
</body>
</html>