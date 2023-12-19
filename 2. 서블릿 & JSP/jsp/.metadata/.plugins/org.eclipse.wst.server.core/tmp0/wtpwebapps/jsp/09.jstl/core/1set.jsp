
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.me.dto.Person"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- core 태그
	변수 선언, 조건문, 반복문 등을 대체하는 태그를 제공 
-->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- set : 변수 선언 ( setAttribute() )
	var	: 변수명 
	value : 값
	scope : 저장 영역 
-->
	<c:set var="directVar" value="100" scope="request" />
	<c:set var="elVar" value="${directVar mod 6 }" />
	<c:set var="dateVar" value="<%=new Date() %>" />
	<c:set var="betweenVar">값</c:set>

	<h2></h2>
	<ul>
		<li>${directVar }</li>
		<li>${elVar }</li>
		<li>${dateVar }</li>
		<li>${betweenVar }</li>	
	</ul>

	<h2>자바빈즈 생성1 - 생성자를 이용</h2>
	<c:set var="person" 
		   value='<%= new Person("GD", 25) %>'></c:set>
	
	<ul>
		<li>${person.name }</li>
		<li>${person.age }</li>
	</ul>
	
	<h2>자바빈즈 생성2 - 생성 후 값을 변경하기</h2>
	<c:set var="person2" value='<%= new Person("대성",30)%>'></c:set>
	<p>변경 전</p>
	<ul>
		<li>${person2 }</li>
		<li>${person2.name }</li>
		<li>${person2.age }</li>
	</ul>
	<!-- 자바빈즈 생성 후 값을 변경해보자
		target : 자바빈즈 변수명
		property : 자바빈즈 속성명(멤버변수명)
		value : 값 지정
	 -->
	 <c:set target="${person2 }" property="name" value="빅뱅"></c:set>
	 <c:set target="${person2 }" property="age" value="20"></c:set>
	 
	 <p>변경 후</p>
	<ul>
		<li>${person2 }</li>
		<li>${person2.name }</li>
		<li>${person2.age }</li>
	</ul>
	
	<hr>
	<h2>List 컬렉션 이용하기</h2>
	<%
	// 리스트 생성
	List<Person> list = new ArrayList<>();
	list.add(new Person("세븐틴", 17));
	list.add(new Person("청하", 28));	
	%>
	<c:set var="list" value="<%=list %>"></c:set>
	<ul>
		<li>${list }</li>
	</ul>
	<ul>
		<li>${list[0].name }</li>
		<li>${list[0].age }</li>
	</ul>
	<ul>
		<li>${list[1].name }</li>
		<li>${list[1].age }</li>
	</ul>
	
	<hr>
	<!-- 리스트를 출력하기 위해서 반복문을 사용한다. -->
	<p>foreach를 사용해서 반복문을 만들어 보자</p>
	<c:forEach var="person" items="<%=list %>">
		이름 : ${person.name }
		나이 : ${person.age }
	</c:forEach>
	
	<hr>
	<h2>Map 컬렉션 이용하기</h2>
	<%
	// 다른 타입의 여러가지 값을 저장하기가 용이
	// ajax, petch를 이용할 경우 
	// 			-> 데이터만 전달 
	//			-> 스크립트에서 데이터를 파싱하여 화면을 다시 그려주어야 한다!
	// 
	Map<String, Person> map = new HashMap<>();
	map.put("person1", new Person("사람1", 27));
	map.put("person2", new Person("사람2", 27));
	%>
	
	
	
	<!-- map은 변수로 선언만 하고 영역에 저장하지 않았기 때문에 el문법으로 사용할 수 없다! -->
	<c:set var="pMap" value='<%= map %>' />
	<ul>
		<li>${pMap }</li>
	</ul>
	<ul>
		<li>${pMap.person1.name }</li>
		<li>${pMap.person1.age }</li>
	</ul>
	<ul>
		<li>${pMap.person2.name }</li>
		<li>${pMap.person2.age }</li>
	</ul>
	
	
	
</body>
</html>