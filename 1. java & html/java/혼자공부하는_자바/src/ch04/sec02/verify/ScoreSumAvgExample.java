package ch04.sec02.verify;
import java.util.Scanner;
public class ScoreSumAvgExample {

	public static void main(String[] args) {
		/*String 연습1
		 * 학생이름 키보드로 입력
		 * 학생 국어, 영어, 수학성적 입력
		 * 총점, 평균
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("학생의 이름 : ");
		String student = scanner.nextLine();
		System.out.print("국어 성적:");
		int kor = scanner.nextInt();
		System.out.print("영어 성적:");
		int eng = scanner.nextInt();
		System.out.print("수학 성적:");
		int math = scanner.nextInt();
		
		int sum = kor + eng + math;
		double avg = (double)sum / 3;
		
		System.out.println(student + " 학생의 성적은");
		System.out.println("국어 : " + kor + "점, 영어 : " + eng + "점, 수학 : " + math + "점");
		System.out.printf("총점 : %d점, 평균 : %.1f점입니다.", sum,avg);
		
		
	}

}
