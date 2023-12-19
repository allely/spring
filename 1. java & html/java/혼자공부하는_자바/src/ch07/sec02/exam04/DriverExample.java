package ch07.sec02.exam04;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		Truck truck = new Truck("테슬라");
		
		//드라이버가 운전합니다
		driver.drive(bus);	//자동형변환 Bus ==> Vehicle
							//부모클래스로 자동형변환
							//더 큰 타입으로 형변환
		
		driver.drive(taxi);
		
		driver.drive(truck);
		
		truck.move();
	}
}