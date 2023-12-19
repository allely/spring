package ch04.sec01.exam02;

import java.util.Scanner;

public class IfElseExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int score = scanner.nextInt();
		//등급변수 선언
		char grade = '\u0000';	//null문자 표현
		
		if(score >= 90) {
			grade = 'A';
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 " + grade +"입니다.");
		} else {
			grade = 'B';
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 " + grade +"입니다.");
		}
	}
}