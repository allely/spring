package ch04.sec02.exam02;

public class ForSumFrom1To100Example1 {

	public static void main(String[] args) {
		int sum = 0;
		// 1에서 100까지의 누적합
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1~100 합 : " + sum);

		// 1~100 홀수 합
		int sum1 = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				sum1 += i;
			}
		}
		System.out.println("1~100 중 홀수 합 : " + sum1);
		
		//1~100 중 3의 배수 합
		int sum2 = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum2 += i;
			}
		}
		System.out.println("1~100 중 3의 배수 합 : " + sum2);
	}
}
