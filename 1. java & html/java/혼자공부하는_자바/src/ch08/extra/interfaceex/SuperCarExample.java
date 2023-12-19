package ch08.extra.interfaceex;

public class SuperCarExample {

	public static void main(String[] args) {
		SuperCar sc = new SuperCar();
		
		//슈퍼카 객체의 기능들을 테스트
		sc.startEngine();		//엔진 시동 : Vehicle 인터페이스
		sc.run();				//도로 운전 : Car 인터페이스
		sc.fly();				//하늘 비행 : Plain 인터페이스
		sc.ship();				//바다 운전 : Ship 인터페이스
		sc.stopEngine();
		System.out.println();
		
		System.out.println("객체를통한 메소드 호출 -fin-");
		
		//부모클래스 타입으로 참조변수를 만들어 SuperCar객체를 참조
		
		Vehicle ve = sc;	//인터페이스형 Vehicle타입만 보이
		ve.startEngine();	//Vehicle타입이 가진 메소드만 보임	
		ve.stopEngine();
		
		Ship sh = sc;
		sh.ship();
		
		Plain pl = sc;
		pl.fly();
		
		Car car = sc;
		car.run();
		
		System.out.println("인터페이스 형식의 부모참조변수로 변환 -fin-");
		
		//위의 부모타입으로부터 다시 자식객체로 만드는 경우
		//강제형변환(다운캐스팅)을 이용
		SuperCar superCar = (SuperCar) ve;
		superCar.startEngine();
		superCar.stopEngine();
		superCar.run();
		superCar.fly();
		superCar.ship();
		
		System.out.println("Vehicle 인터페이스 형식을 "
				+ "\n다시 SuperCar참조변수로 가리키도록(참조) 하는 경우 -fin-");
	}
}
