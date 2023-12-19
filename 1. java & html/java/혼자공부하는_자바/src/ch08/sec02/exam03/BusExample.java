package ch08.sec02.exam03;

public class BusExample {
	public static void main(String[] args) {
		//자손클래스 Bus객체를 생성해서 
		//	인터페이스 Vehicle형의 부모참조변수 vehicle변수로 참조한다.
		Vehicle vehicle = new Bus();
		vehicle.start();
		vehicle.run();
		vehicle.stop();
		
		//강제로 버스로 만들어 부모에서 자식객체의 나머지를 참조할 수 있도록 한다.
		//이것을 강제형식변환이라고 한다.(DownCasting)
		//다운캐스팅은 반드시 부모객체가 참조하던(가리키던) 구현타입과 같아야 한다.
		Bus bus = (Bus) vehicle;	//vehicle이 원래 가리키던 bus객체를 의미
		
		//bus의 문을 엽니다.
		bus.openDoor();
		
		//버스의 문을닫습니다.
		bus.closeDoor();
		
		//요금을 확인합니다.
		bus.checkFare();
	}
}
