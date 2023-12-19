package ch05.sec02.exam01;

public class ArrayCreateByValueListExample {

	public static void main(String[] args) {
		int[] scores = {83, 90, 87};
		
		System.out.println("score[0] : " + scores[0]);
		System.out.println("score[1] : " + scores[1]);
		System.out.println("score[2] : " + scores[2]);
		
		//반복문으로 출력해보기
		for(int index = 0; index<3; index++) {
			System.out.println("score[index] : " + scores[index]);
		}
		
		int sum = 0; 
		for(int i = 0; i < 3; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		double avg = (double) sum / 3;
		System.out.println("평균 : " + avg);
	}
}
