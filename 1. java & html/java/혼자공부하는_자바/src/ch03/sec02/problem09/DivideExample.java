package ch03.sec02.problem09;

import java.util.Scanner;

public class DivideExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 두 수 입력
		System.out.print("첫번째 수 : ");
		double num1 = sc.nextDouble();

		System.out.print("두번째 수 : ");
		double num2 = sc.nextDouble();
		// 두 수 나누기
		/*
		 * if((num2 == 0) || (num2 == 0.0)) { System.out.println("결과 : 무한대"); } else {
		 * double result = num1 / num2; System.out.println("결과 : " + result); }
		 */
		// 실제 프로그램은 정상적으로 동작하고
		// 혹시나 예외가 나면 에러처리가 동작하도록 하는 것이 좋은 구조
		if ((num2 != 0.0)) {
			double result = num1 / num2;
			System.out.println("결과 : " + result);
		} else {
			System.out.println("결과 : 무한대");
		}
	}
}
