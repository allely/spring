<%@page import="com.me.dto.EmpDto"%>
<%@page import="java.util.List"%>
<%@page import="com.me.dao.EmpDao"%>
<%@page import="com.board.DBConnection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>JDBC 테스트 1</h2>
	<%
	DBConnection dbcon = new DBConnection();
	dbcon.stmt = dbcon.con.createStatement();
	dbcon.rs = dbcon.stmt.executeQuery("SELECT SYSDATE FROM DUAL");
	
	dbcon.rs.next();
	dbcon.rs.getString(1);
	
	// 자원 반납
	dbcon.close();
	           
	out.print("<br>init param : " + application.getInitParameter("INIT_PARAM"));
	out.print("<br>init param : " + application.getInitParameter("driver"));
	out.print("<br>init param : " + application.getInitParameter("id"));
	out.print("<br>init param : " + application.getInitParameter("pw"));
	
	// EmpDao dao = new EmpDao();
	// dao.getList();
	%>
	
	<h2>JDBC 테스트 2</h2>
	<%
	DBConnection dbcon2 = new DBConnection(
							application.getInitParameter("driver")
							, application.getInitParameter("url")
							, application.getInitParameter("id")
							, application.getInitParameter("pw")
							);
	dbcon2.close();	
	%>
	
	<h2>JDBC 테스트 3</h2>
	<%
	DBConnection dbcon3 = new DBConnection(application);
	dbcon3.close();
	%>
	<h2>empDao.getList()</h2>
	<%
	EmpDao empDao = new EmpDao(application);
	List<EmpDto> list = empDao.getList();
	//out.print(list);
	
	
	%>
	<table>
		<tr>
			<td>사원ID</td>
			<td>사원명</td>
			<td>주민번호</td>
		</tr>
		<%
		for(EmpDto dto : list){
		%>
		<tr>
			<td><%=dto.getEmp_id() %></td>
			<td><%=dto.getEmp_name() %></td>
			<td><%=dto.getEmp_no() %></td>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>