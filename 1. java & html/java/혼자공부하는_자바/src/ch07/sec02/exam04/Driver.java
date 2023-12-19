package ch07.sec02.exam04;

public class Driver {
	public void drive(Vehicle vehicle) {
		vehicle.run();
	}
	
	public void drive(Bus bus) {
		System.out.println("bus - " + bus);
		bus.run();
	}
	
	public void drive(Taxi taxi) {
		System.out.println("taxi - " + taxi);
		taxi.run();
	}
}
////메소드 중첩(오버로딩) 시 실행되는 메소드는?
////	