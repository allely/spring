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
	// 변수 선언 및 값 할당
	int num1 = 3;

	// 페이지 영역에 값을 저장
	pageContext.setAttribute("num2", 4);
	pageContext.setAttribute("num3", "5");
	pageContext.setAttribute("num4", "8");
%>

<h3>변수 선언 및 할당</h3>
<!-- html은 영역(page, request, session, application)에 저장되지 않으므로 출력되지 않음 -->
	<p>스크립틀릿에서 선언한 변수 : ${num1 }</p>
	<p>페이지 영역에 저장한 변수 : ${num2}, ${num3}, ${num4 }</p>
	
	<!-- jsp 3.0버전부터 대입연산자(=)를 이용하여 값을 대입할 수 있다. -->
	<p>변수 할당 및 즉시 출력 : ${num1 = 7 }</p>
	<p>변수 할당 : ${num2 = 8;"" }</p> <!-- 할당 뒤 ;"문자열"이 있다면 뒤 문자열 출력 -->
	<p>할당된 값 출력 : ${num2 }</p>
	
	<hr>
	
	num1=${num1 }, num2=${num2 }, num3=${num3}, num4=${num4 }
	
<br>num1 + num2 = ${num1 + num2 }
<br>num1 - num2 = ${num1 - num2 }
<br>num1 * num2 = ${num1 * num2 }
<br>num1 / num2 = ${num1 / num2 }

<!-- 표현언어를 이용하면 산술 연산시 자동으로 숫자로 변환
	(문자형태의 숫자를 숫자로 변환하여 연산) -->
	
<br>num3 / num4 = ${num3 / num4 }
<br>num3 % num4 = ${num3 % num4 }

<!-- 문자 형태의 연산자
	/ = div
	% = mod -->
<br>num3 div num4 = ${num3 div num4 }
<br>num3 mod num4 = ${num3 mod num4 }
	
<!-- + 연산자 : 문자열의 연결시 오류 발생
	el표현언어에서 + 연산자는 숫자와의 연산만 가능
 -->
 <br>${num1 + "34" }	<!-- 문자열로 들어간 "숫자"는 숫자로 +연산 -->
 <br>\${num1 + "str"" }	<!-- 문자열의 +연산은 오류-->
 
 	<h3>비교연산자</h3>
 	<!-- 문자 형태의 연산자 -->
 	<!-- 문자형태의 연산자를 사용하여 코드를 좀 더 직관적으로 알 수 있다. -->
<br>num1 == num4 : ${num1 eq num4}
<br>num4 > num3 : ${num4 gt num3 }
<br>num1 < num3 : ${num1 lt num3}
<br>num2 >= num4 : ${num2 ge num4 }

<br>${num1 > num4 }

	<h3>논리 연산자</h3>
<br>num3 <= num4 && num3 == num4 : ${num3 le num4 and num3 eq num4 }
<br>num3 >= num4 || num3 != num4 : ${ num3 ge num4 or num3 ne num4 }
<br>
<br>
</body>
</html>