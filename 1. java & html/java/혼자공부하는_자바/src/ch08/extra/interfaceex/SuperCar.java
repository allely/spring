package ch08.extra.interfaceex;

//자동차, 비행기, 배 인터페이스로부터 인터페이스 상속을 받는다.
public class SuperCar implements Car, Plain, Ship{

	@Override
	public void startEngine() {
		System.out.println("엔진을 시작합니다.");
	}

	@Override
	public void stopEngine() {
		System.out.println("엔진을 멈춥니다.");
	}

	@Override
	public void ship() {
		System.out.println("바다 위를 달립니다.");
	}

	@Override
	public void fly() {
		System.out.println("푸른 하늘을 빠르게 비행합니다.");
	}

	@Override
	public void run() {
		System.out.println("고속도로를 시원하게 달립니다.");
	}
}
