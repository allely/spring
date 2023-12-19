package ch07.sec01.exam04;

public class SupersociAirplaneExample {

	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		
		//비행기 이륙
		sa.takeOff();
		
		sa.fly();
		
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();
		
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly();
		
		sa.land();
	}
}