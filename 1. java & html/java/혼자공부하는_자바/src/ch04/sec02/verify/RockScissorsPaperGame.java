package ch04.sec02.verify;

import java.util.Random;
import java.util.Scanner;

public class RockScissorsPaperGame {

	public static void main(String[] args) {
		int ROCK = 1;
		int SCISSORS = 2;
		int PAPER = 3;

		Scanner sc = new Scanner(System.in);

		Random random = new Random();
		
		boolean on = true;
		int comWinCount = 0;
		int userWintCount = 0;
		
		while (on) {
			System.out.println("가위 바위 보 게임");
			System.out.println("1. 바위, 2. 가위, 3. 보, 0. 종료");
			System.out.printf("숫자를 입력하세요 : ");
			
			int User = sc.nextInt();
			int r = random.nextInt(3) + 1;
			
			if(User == r){
				System.out.println("무승부");
			} else if (((User == ROCK) && (r == 2)) 
					|| ((User == SCISSORS) && (r == 3))
					|| ((User == PAPER) && (r == 1))) {
				System.out.println("user : " + User);
				System.out.println("Com : " + r);
				System.out.println("유저 승");
				userWintCount++;
			}
			else if (((User == ROCK) && (r == 3)) 
					|| ((User == SCISSORS) && (r == 1))
					|| ((User == PAPER) && (r == 2))){
				System.out.println("user : " + User);
				System.out.println("Com : " + r);
				System.out.println("컴퓨터 승");
				comWinCount++;
			}
			else if (User == 0) {
				on = !on;
			}
			System.out.println("유저 승 : " +  userWintCount +"회");
			System.out.println("컴퓨터 승 : " + comWinCount + "회");
			System.out.println("\n");
		}
		System.out.println("종료");
	}
}
