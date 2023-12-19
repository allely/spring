package ch07.sec02.exam04;

public class Taxi extends Vehicle{
	//Vehicle클래스의 run() 재정의
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
}
