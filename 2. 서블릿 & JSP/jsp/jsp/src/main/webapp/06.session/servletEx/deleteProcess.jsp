<%@page import="com.me.utils.JSFunction"%>
<%@page import="com.me.dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	if(request.getParameter("num") != null){
			String num = request.getParameter("num");
			BoardDao dao = new BoardDao();
			if(dao.deleteBoard(num) != 1){
		JSFunction.alertBack("존재하지 않는 게시글입니다.",out);
			}
			// 정상적으로 삭제처리가 된 경우
			// 메세지 처리 후 리스트 페이지로 이동한다.
			JSFunction.alertBack("삭제되었습니다.", "/boardList", out);
		} else {
			out.print("<script type='text/javascript'>");
			// 메시지 출력 후 이전 페이지로 이동하기
			out.print("alert('게시물번호(num)을 확인할 수 없습니다.');");
			// 
			out.print("location.href=''");	//"history.back()" 
			out.print("</script>");
		}
	%>
	<script type='text/javascript'>
		alert('test');
	</script>
	
</body>
</html>