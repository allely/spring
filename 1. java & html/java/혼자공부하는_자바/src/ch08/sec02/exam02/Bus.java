package ch08.sec02.exam02;

public class Bus implements Vehicle{

	@Override
	public void run() {
		System.out.println("버스가 달리고 있습니다.");
	}
}