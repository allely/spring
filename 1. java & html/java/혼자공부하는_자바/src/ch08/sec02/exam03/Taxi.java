package ch08.sec02.exam03;

public class Taxi implements Vehicle, VehicleEx{

	@Override
	public void run() {
		System.out.println("택시다 달립니다.");
		
	}

	@Override
	public void start() {
		System.out.println("택시가 출발합니다.");
		
	}

	@Override
	public void stop() {
		System.out.println("택시가 멈춥니다.");
		
	}

	@Override
	public void openDoor() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeDoor() {
		// TODO Auto-generated method stub
		
	}
	

}
