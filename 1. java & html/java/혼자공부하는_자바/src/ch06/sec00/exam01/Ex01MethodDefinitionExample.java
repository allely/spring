package ch06.sec00.exam01;

import java.util.Scanner;

public class Ex01MethodDefinitionExample {
	//자주 반복해서 사용하는 코드를 대표이름을 붙여서 
	// 그 이름으로 부르기만 하면 그 코드들이 실행.
	//  함수라고 부르고, 자바는 모든 함수는 클래스에 속해야 하므로
	//   그 클래스의 함수라는 의미로 메소드라 한다.
	//메소드 정의
	static int sum(int a, int b) {
		return a + b;
	}
	////
	static int add(int a, int b) {
		return a + b;
	}
	static int sub(int a, int b) {
		return a - b;
	}
	static int mul(int a, int b) {
		return a * b;
	}
	static int div(int a, int b) {
		return a / b;
	}
	public static int[] inputNumber() {
		int[] number = new int[2];
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫 번째 수: ");
		number[0] = scanner.nextInt();
		System.out.print("두 번째 수: ");
		number[1] = scanner.nextInt();
		
		//배열명은 힙에 저장되어 있는 참조데이터를 가르키는 주소(포인터)입니다.
		return number;
	}
	public static void main(String[] args) {
		//메소드 호출하면
		//  메소드는 호출한다(=실행한다)이므로 데이터 값을 리턴한다.
		//  연산자와 같다.
		//  연산자는 사실 메소드. 메소드계의 스타를 연산자라고 한다.
		int sumResult = sum(1,3);
		
		//위 결과를 출력
		System.out.println(sumResult);
		System.out.println(sum(1,3));
		System.out.println("--------------------------");
		
		
		int[] resultNumber = new int[4];
		int[] number = inputNumber();		//숫자 입력받는 메소드 호출
		
		//입력받은 두 수를 이용하여 사칙연산 실행
		resultNumber[0] = add(number[0], number[1]);
		resultNumber[1] = sub(number[0], number[1]);
		resultNumber[2] = mul(number[0], number[1]);
		resultNumber[3] = div(number[0], number[1]);
		
		//화면에 출력하는 뷰
		//메세지를 한꺼번에 출력.
		//출력할 메세지 만들기
		String msg = makeCalcResultString(number, resultNumber);
		
		printCalcResult(msg);
	}//main end
	/*
	 * 함수 - 두가지 타입
	 * 리턴값(데이터값)이 있는 함수 = 일반적인 함수
	 * 리턴값이 없는 함수 = 명령형 함수
	 * 명령형 함수는 리턴값이 없음을 뜻하는 void를 리턴값으로 표시
	 */
	
	//계산 결과 출력 = 명령형 함수 = 리턴값이 없음 = void
	// printCalcResult(출력할 문자열 입력)
	public static void printCalcResult(String calcResultString) {
		System.out.println(calcResultString);
		// return ; // 허용됨
	}
	
	//makeCalcResultString(입력숫자배열, 계산결과 배열)
	//  => 계산결과 문자열 되돌려줌
	//메소드선언 만들기
	public static String makeCalcResultString(int[] number, int[] resultNumber) {
		String msg =  """
				$x + $y = $resultAdd
				$x - $y = $resultSub
				$x * $y = $resultMul
				$x / $y = $resultDiv
				"""
				.replace("$x", "" + number[0])
				.replace("$y", "" + number[1])
				.replace("$resultAdd", "" + resultNumber[0])
				.replace("$resultSub", "" + resultNumber[1])
				.replace("$resultMul", "" + resultNumber[2])
				.replace("$resultDiv", "" + resultNumber[3]);
		return msg;	//msg문자열을 함수 외부로 내보냄
	}
}
