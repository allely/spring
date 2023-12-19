package ch04.sec02.verify;

import java.util.Random;
import java.util.Scanner;

public class RSPGameSwitchCase {

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
			System.out.println("=================================");
			System.out.println("가위 바위 보 게임");
			System.out.println("1. 바위, 2. 가위, 3. 보, 0. 종료");
			System.out.printf("숫자를 입력하세요 : ");
			
			int User = sc.nextInt();
			int r = random.nextInt(3) + 1;
			String result = "";
			
			// 승, 패, 무승부 판단
			if (User == r) {
				result = "draw";
			} else if (((User == ROCK) && (r == 2)) 
					|| ((User == SCISSORS) && (r == 3))
					|| ((User == PAPER) && (r == 1))) {
				result = "win";
			} else if (((User == ROCK) && (r == 3)) 
					|| ((User == SCISSORS) && (r == 1))
					|| ((User == PAPER) && (r == 2))) {
				result = "lose";
			} else if (User == 0) {
				on = !on;
			}
			//결과 출력
			switch (result) {
			case "draw":
				System.out.println("user : " + User);
				System.out.println("Com : " + r);
				System.out.println("무승부");
				break;
			case "win":
				System.out.println("user : " + User);
				System.out.println("Com : " + r);
				System.out.println("유저 승");
				userWintCount++;
				break;
			case "lose":
				System.out.println("user : " + User);
				System.out.println("Com : " + r);
				System.out.println("컴퓨터 승");
				comWinCount++;
				break;
			}
			System.out.println("유저 승 : " + userWintCount + "회");
			System.out.println("컴퓨터 승 : " + comWinCount + "회");
			System.out.println("\n");
		}
		System.out.println("종료");
	}
}