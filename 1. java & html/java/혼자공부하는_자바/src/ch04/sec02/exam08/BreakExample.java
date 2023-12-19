package ch04.sec02.exam08;

public class BreakExample {

	public static void main(String[] args) {

		while (true) {
			// 1에서 6까지의 난수 생성
			int num = (int) (Math.random() * 6 + 1);
			System.out.println(num);

			// num = 6이면 루프 종료
			if (num == 6) {
				break;
			}
		}
		System.out.println("종료합니다.");
	}
}
