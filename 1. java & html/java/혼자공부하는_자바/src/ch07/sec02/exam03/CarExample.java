package ch07.sec02.exam03;

public class CarExample {

	public static void main(String[] args) {
		System.out.println("?");
		Car car = new Car(); // Car객체 생성

		// 일단 차를 달려봅니다.
		// 달리는 도중에 타이어에 문제가 있을 수 있습니다.
		for (int i = 1; i <= 6; i++) {
			int problemLocation = car.run();		//타이어가 동시에 터진다면 ?
													//여기서는 알 수 없다...

			// 문제가 생겼는가 판별					
			switch (problemLocation) {
			case 1: // 앞쪽 왼쪽 타이어 문제
				System.out.println("앞왼쪽 타이어를 교체");
				car.frontLeftTire = new Tire("앞왼쪽", 15);
				break;
			case 2: // 앞쪽 오른쪽에 타이어 문제
				System.out.println("앞오른쪽 타이어를 교체");
				car.frontRightTire = new Tire("앞오른쪽", 13);
				break;
			case 3: // 뒤쪽 왼쪽에 문제
				System.out.println("뒤왼쪽 타이어를 교체");
				car.backLeftTire = new Tire("뒤왼쪽", 14);
				break;
			case 4: // 뒤쪽 오른쪽에 문제
				System.out.println("뒤오른쪽 타이어를 교체");
				car.backRightTire = new Tire("뒤오른쪽", 17);
				break;
			default:// prblemLocation == 0 정상주헹
				break;
			}
			System.out.println("-----------------------------");
		}
	}
}
