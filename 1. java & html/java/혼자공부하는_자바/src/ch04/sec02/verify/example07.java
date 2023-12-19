package ch04.sec02.verify;

import java.util.Scanner;
public class example07 {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("--------------------------------------");
			System.out.print("선택> ");
			
			int choice = Integer.parseInt(scanner.nextLine());
			
			if(choice == 1) {
				System.out.print("예금액> ");
				int in_money = scanner.nextInt();
				if(in_money > 0) {
					balance += in_money ;
				} else {
					System.out.println("잘못 입력하셨습니다.");
				}
			} else if(choice == 2) {
				System.out.print("출금액> ");
				int out_money = scanner.nextInt();
				if((balance - out_money)  >= 0) {
					balance -= out_money;
				} else {
					System.out.println("잔고가 부족합니다.");
				}
			} else if(choice == 3) {
				System.out.println("잔고> " + balance);
			} else if(choice == 4) {
				run = !run;
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
		System.out.println("\n프로그램 종료");
	}
}
