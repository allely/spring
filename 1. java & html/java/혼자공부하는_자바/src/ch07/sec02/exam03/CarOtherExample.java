package ch07.sec02.exam03;

public class CarOtherExample {

	public static void main(String[] args) {
		// Car 객체 생성
		Car car = new Car();

		for (int i = 1; i <= 5; i++) {
			// 차를 달립니다.
			int problemLocation = car.run();

			// 문제 발견
			// 문제가 생겼는가 판별
			switch (problemLocation) {
			case 1: // 앞쪽 왼쪽 타이어 문제
				System.out.println("앞왼쪽 한국타이어를 교체");
				car.frontLeftTire = new HankookTire("앞왼쪽", 15);
				break;
			case 2: // 앞쪽 오른쪽에 타이어 문제
				System.out.println("앞오른쪽 금호타이어를 교체");
				car.frontLeftTire = new KumhoTire("앞오른쪽", 13);
				break;
			case 3: // 뒤쪽 왼쪽에 문제
				System.out.println("뒤왼쪽 금호타이어를 교체");
				car.frontLeftTire = new KumhoTire("뒤왼쪽", 14);
				break;
			case 4: // 뒤쪽 오른쪽에 문제
				System.out.println("뒤오른쪽 한국타이어를 교체");
				car.frontLeftTire = new HankookTire("뒤오른쪽", 117);
				break;
			default:// prblemLocation == 0 정상주헹
				break;
			}
			System.out.println("-----------------------------");
		}

	}

}
