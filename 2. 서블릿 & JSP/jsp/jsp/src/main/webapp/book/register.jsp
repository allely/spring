<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>SB Admin 2 - Register</title>

    <!-- Custom fonts for this template-->
    <link href="../vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link
        href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
        rel="stylesheet">

    <!-- Custom styles for this template-->
    <link href="../css/sb-admin-2.min.css" rel="stylesheet">

<title>Insert title here</title>
<script type="text/javascript">
	window.onload = function(){
			/*
				var - 변수의 중복선언이 가능
				let - 지역변수, 중복선언 불가
				const - 지역변수, 중복선언 불가능
			*/
			
			//event.preventDefault();
			let regBtn = document.querySelector("#regBtn");
			
			// 익명의 함수를 작성할 수도 있고, 이미 작성된 함수의 이름을 넘겨줄 수도 있다.
			// 함수의 이름을 넘겨줄 때에는 함수이름 뒤에 ()를 붙이면 안된다!!!
			// 함수이름() : 함수를 실행하라는 의미
			regBtn.addEventListener('click', validationCheck);
			
			regBtn.addEventListener('click', function(){
				// 유효성검사
				let res = validateForm(regForm);
				if(res){								
					// 등록 요청
					regForm.action = "/book/regProcess";
					regForm.method = "post";
					
					regForm.submit();
				}			
			});
	}
	
	function getByteLength(str) {
		  // TextEncoder 객체 생성 (UTF-8 사용) : 한글 3byte로 계산됨
		  var encoder = new TextEncoder('utf-8');
		  // 문자열을 바이트 배열로 인코딩
		  var encoded = encoder.encode(str);
		  // 바이트 배열의 길이 반환
		  return encoded.length;
	} 
	
	function validationCheck(){
		// 아이디 입력여부, 길이제한 확인
		if(id.value == "") {
			alert("아이디를 입력해주세요.")
			return false;
		}
		if(id.value.length > 10){
			alert('아이디의 길이는 10자를 초과할 수 없습니다.')
			return false;
		}
		let name = document.querySelector("#name");
		
		// 이름 입력여부, 길이제한 확인
		if(name.value == ""){
			alert('이름을 입력해주세요.');
			name.focus();
			return false;
		}
		if(name.value.length > 15){
			alert('이름의 길이는 15자를 초과할 수 없습니다.');
			name.focus();
			return false;
		}
		
		// 이메일
		if(email.value == ""){
			alert('email을 입력해주세요.');
			email.focus();
			return false;
		}
		if(email.value > 100){
			alert('email의 길이는 100자를 초과할 수 없습니다.');
			email.focus();
			return false;
		}
		// 정규식 패턴문자열을 생성
		let email_reg = /^[\w\.-]+@[a-zA-Z\d\.-]+\.[a-zA-Z]{2,}$/;
		// 패턴문자열과 일치하는지 확인
		if(!email.reg.test(email.value)){
			alert('이메일 형식이 일치하지 않습니다.');
			email.focus();
			return false;
		}
		
		if(pw.value == ""){
			alert('비밀번호를 입력해주세요');
			pw.focus();
			return false;
		}
		if(pw.value.length > 10){
			alert('비밀번호의 길이는 10자를 초과할 수 없습니다.');
			pw.focus();
			return false;
		}
		if(pw.value != pwCheck.value){
			alert('비밀번호가 일치하지 않습니다.');
			pwCheck.focus();
			return false;
		}
		
/*		// 등록 요청
		regForm.action = "/book/regProcess";
		regForm.method = "post";
		
		regForm.submit();
*/
	}
	
	function validateForm(form) {

		if(id.value == ""){
			alert('id');
			id.focus();
			return false;
		}
		
		if(name.value == ""){
			alert('name');
			name.focus();
			return false;
		}
		
		if(email.value == ""){
			alert('email');
			email.focus();
			return false;
		}
		
		if(pw.value == ""){
			alert('pw');
			pw.focus();
			return false;
		}
		return true;
	}
</script>

</head>
<body class="bg-gradient-primary">

    <div class="container">

        <div class="card o-hidden border-0 shadow-lg my-5">
            <div class="card-body p-0">
                <!-- Nested Row within Card Body -->
                <div class="row">
                    <div class="col-lg-5 d-none d-lg-block bg-register-image"></div>
                    <div class="col-lg-7">
                        <div class="p-5">
                            <div class="text-center">
                                <h1 class="h4 text-gray-900 mb-4">회원가입</h1>
                            </div>
                            <form class="user" name="regForm">
                                <div class="form-group">
                                        <input type="text" class="form-control form-control-user" 
                                        	id="id" name="id" placeholder="id">                             
                                </div>
                                <div class="form-group">
                                        <input type="text" class="form-control form-control-user" 
                                        	id="name" name="name" placeholder="이름">                             
                                </div>
                                <div class="form-group">
                                    <input type="email" class="form-control form-control-user" 
                                    		id="email" name="email" placeholder="Email 주소">
                                </div>
                                <div class="form-group rows">
	                                <div class="form-group">
	                                        <input type="password" class="form-control form-control-user"
	                                            id="pw" name="pw" placeholder="비밀번호">                                    
	                                </div>
	                                <div class="form-group">
	                                        <input type="password" class="form-control form-control-user"
	                                            id="pwCheck" name="pwCheck" placeholder="비밀번호 확인">                                    
	                                </div>
                                </div>
                                <a id="regBtn" class="btn btn-primary btn-user btn-block">
                                    회원 가입
                                </a>
                                <hr>
                                <a href="index.html" class="btn btn-google btn-user btn-block">
                                    <i class="fab fa-google fa-fw"></i> 구글 아이디로 로그인
                                </a>
                                <a href="index.html" class="btn btn-facebook btn-user btn-block">
                                    <i class="fab fa-facebook-f fa-fw"></i> 페이스북 아이디로 로그인
                                </a>
                            </form>
                            <hr>
                            <div class="text-center">
                                <a class="small" href="forgot-password.html">비밀번호 찾기</a>
                            </div>
                            <div class="text-center">
                                <a class="small" href="login.html">로그인하기</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

    </div>

    <!-- Bootstrap core JavaScript-->
    <script src="../vendor/jquery/jquery.min.js"></script>
    <script src="../vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    <!-- Core plugin JavaScript-->
    <script src="../vendor/jquery-easing/jquery.easing.min.js"></script>

    <!-- Custom scripts for all pages-->
    <script src="../js/sb-admin-2.min.js"></script>

</body>
</html>