package ch05.sec02.verify;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		//기호상수
		//이 부분의 내용은 나중에 Eum클래스로 발전하게 됩니다.
		final int MENU_STUDENT_NUMBER = 1;
		final int MENU_SCORE_INPUT = 2;
		final int MENU_SCORE_LIST = 3;
		final int MENU_SCORE_ANALYSIS = 4;
		final int MENU_EXIT = 5;
		
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("-------------------------------------------------------------");
			System.out.println(" 1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료 ");
			System.out.println("-------------------------------------------------------------");
			System.out.print("선택>");

			int selectNo = Integer.parseInt(scanner.nextLine());

			switch (selectNo) {
			case MENU_STUDENT_NUMBER:
				System.out.print("학생수>");
				studentNum = Integer.parseInt(scanner.nextLine());
				break;
			case MENU_SCORE_INPUT:
				scores = new int[studentNum];
				for (int i = 0; i < studentNum; i++) {
					System.out.print("score[" + i + "]>");
					scores[i] = Integer.parseInt(scanner.nextLine());
				}
				break;
			case MENU_SCORE_LIST:
				for (int i = 0; i < studentNum; i++) {
					System.out.println("score[" + i + "]>" + scores[i]);
				}
				break;
			case MENU_SCORE_ANALYSIS:
				int max = 0;

				int total = 0;

				for (int i = 0; i < studentNum; i++) {
					if (scores[i] > max) {
						max = scores[i];
					}
					//max = (scores[i] > max) ? scores[i] : max;    
					//(scores[i] > max)가 true라면 scores[i]가, false라면 max가 앞의 max값에 저장된다.
					//if 비교문 대신 쓸 수 있다.
					total += scores[i];
				}
				System.out.println("최고 점수 : " + max);
				System.out.println("평균 점수 : " + (double) total / studentNum);
				break;
			case MENU_EXIT:
				run = false;
				break;	
			default :
				System.out.println("메뉴선택이 잘못되었습니다.");
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}
