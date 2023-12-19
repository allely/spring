//논리연산자
package ch03.sec02.exam09;

import java.util.Scanner;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		//String charCode = 'A';	//String형은 ""로

		Scanner sc = new Scanner(System.in);
		//Scanner 클래스를 이용하여 문자 입력하기
		//Scanner 클래스는 문자 입력기능 대신 문자열 기능을 사용
		// 일단 next() 함수를 사용하여 문자열을 입력.
		// 그리고 charAt(문자열인덱스)를 사용하여 해당 인덱스의 문자를 가져온다
		//sc.next() : 키보드로부터 문자열 입력
		//문자열.charAt(0) : 첫번째 위치의 문자를 가져온다
		//sc.nextInt() : 정수로 입력받는다
		
		char charCode = sc.next().charAt(0);
		
		if((charCode >= 65) & (charCode <= 90)) {
			System.out.println("대문자군요");
		}	
		if((charCode >= 97) & (charCode <= 122)) {
			System.out.println("소문자군요");
		}
		if((charCode >= 48) & (charCode <= 57)) {
			System.out.println("0~9 숫자군요");
		}
		
		int value = 6;
		value = sc.nextInt();
		
		if( (value%2 == 0) | (value%3 == 0) ) {
			System.out.println("|사용, 2 또는 3의 배수군요");
		}
		
		if( (value%2 == 0) || (value%3 == 0) ) {
			System.out.println("||사용, 2 또는 3의 배수군요");
		}
	}
}