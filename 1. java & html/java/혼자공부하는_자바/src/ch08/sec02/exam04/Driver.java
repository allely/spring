package ch08.sec02.exam04;

public class Driver {
	public void drive(Vehicle vehicle) {
		
		if(vehicle instanceof Bus) {	//vehicle 참조변수가 가리키는 객체가 Bus인지 확인
			Bus bus = (Bus) vehicle;	//Bus객체이면 강제로 Bus객체로 변환
										//자식객체의 기능을 사용하려 함
			bus.checkFare();			//자식객체(Bus)의 메소드 사용
		}					

		//다른 차종은 그냥 달려도 된다.
		vehicle.run();
	}
}