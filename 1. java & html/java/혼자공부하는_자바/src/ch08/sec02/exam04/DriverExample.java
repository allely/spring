package ch08.sec02.exam04;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		//버스 객체 생성
		Bus bus = new Bus();
		
		//택시 객체 생성
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		
		driver.drive(taxi);
	}
}
