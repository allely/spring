package ch07.sec02.exam03;

public class Car {
	//필드
	final int CAR_TIRE_PROBLEM_FRONT_LFET = 1;
	final int CAR_TIRE_PROBLEM_FRONT_RIGHT = 2;
	final int CAR_TIRE_PROBLEM_BACK_LFET = 3;
	final int CAR_TIRE_PROBLEM_BACK_RIGHT = 4;

	Tire frontLeftTire = new Tire("앞왼쪽", 6);
	Tire frontRightTire = new Tire("앞오른쪽", 2);
	Tire backLeftTire = new Tire("뒤왼쪽", 3);
	Tire backRightTire = new Tire("뒤오른쪽", 4);
	
	//생성자

	//메소드
	int run() {
		System.out.println("[자동차가 달립니다.]");
		if(frontLeftTire.roll() == false) {
			stop();
			return CAR_TIRE_PROBLEM_FRONT_LFET;
		}
		if(frontRightTire.roll() == false) {
			stop();
			return CAR_TIRE_PROBLEM_FRONT_RIGHT;
		}
		if(backLeftTire.roll() == false) {
			stop();
			return CAR_TIRE_PROBLEM_BACK_LFET;
		}
		if(backRightTire.roll() == false) {
			stop();
			return CAR_TIRE_PROBLEM_BACK_RIGHT;
		}
		return 0;
	}
	
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
}
