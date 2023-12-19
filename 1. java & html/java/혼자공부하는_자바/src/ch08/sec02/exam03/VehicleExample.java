package ch08.sec02.exam03;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		
//		vehicle.checkFare();		
//		//버스 고유메소드라서 부모클래스인 인터페이스에서 사용할 수 없다.

		Bus bus = (Bus)vehicle;		//부모클래스를 버스 타입으로 강제 형변환
									//	그래서 지금부터 bus변수는 BUS타입이 됨
		
		bus.run();
		bus.checkFare();
	}
}
