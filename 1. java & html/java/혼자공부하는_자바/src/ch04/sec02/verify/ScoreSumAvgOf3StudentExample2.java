package ch04.sec02.verify;

import java.util.Scanner;

public class ScoreSumAvgOf3StudentExample2 {

	public static void main(String[] args) {
		/*
		 *3명의 학생의 이름 입력
		 *3명 각각 국어, 영어, 수학 성적 입력
		 *각 학생의 총점, 평균
		 *각 과목의 총점, 평균
		*/
		Scanner scanner = new Scanner(System.in);
		String[] student = new String[5];
		int[] kor = new int[5];
		int[] eng = new int[5];
		int[] math = new int[5];
		
		for(int i = 0; i<3; i++) {
			System.out.print("학생의 이름 : ");
			student[i] = scanner.next();    
			
			System.out.print("국어 성적:");
			kor[i] = scanner.nextInt();
			
			System.out.print("영어 성적:");
			eng[i] = scanner.nextInt();
			
			System.out.print("수학 성적:");
			math[i] = scanner.nextInt();
		}
		
		for(int i = 0; i < 3; i++) {	
			int sum = kor[i] + eng[i] + math[i];
			double avg = (double) sum / 3;
			System.out.println(student[i] + " 학생의 성적은");
			System.out.println("국어 : " + kor[i] + "점, 영어 : " + eng[i] + "점, 수학 : " + math[i] + "점");
			System.out.printf("총점 : %d점, 평균 : %.1f점입니다.\n", sum,avg);
		}
	}
}