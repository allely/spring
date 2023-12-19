package ch08.sec02.exam03;

public class Bus implements VehicleEx {
	//필드
	//버스가 멈추었는지 확인하는 변수
	//인터페이스를 설계할 때 인터페이스의 상태를 모니터링하는 변수를 사용하면 좋다.
	//현재는 버스가 멈추었는가(stop) 달리는가(run)를 가리킨다.
	boolean isStop;
	
	//생성자
	Bus(){
		//아직 버스가 움직이지 않았으므로 (start() 또는 run())
		isStop = true;
	}

	@Override
	public void run() {
		if(isStop == true) {
			start();
		}
		isStop = false;
		System.out.println("버스가 달립니다.");
	}
	
	//버스 클래스 고유메소드
	//인터페이스에서 쓸 수 없다
	public void checkFare() {
		System.out.println("요금을 확인합니다.");
	}
	
	//자동 문열기
	public void openDoor() {
		//안전을 생각해서 정지상태에서 문을 열어야 한다.
		if(isStop == true) {
			System.out.println("문을 엽니다.");
		} else {
			stop();
			System.out.println("문을 엽니다.");
		}
	}
	
	//자동 문닫기
	public void closeDoor() {
		System.out.println("문을 닫습니다.");
	}

	@Override
	public void start() {
		System.out.println("버스가 출발합니다.");
		
	}

	@Override
	public void stop() {
		System.out.println("버스가 멈춥니다.");
	}
}
