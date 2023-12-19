package ch06.sec05.exam01;

public class Car {
	////필드
	String model;
	int speed;
	
	public Car(String model) {
		//필드의  model = 매개변수로 넘어온 model 
		this.model = model;
		
	}
	
	////메소드
	
	//입력한 속도로 설정
	void setSpeed(int speed) {
		//필드의 speed = 매개변수로 넘어온 speed
		this.speed = speed;
	}
	
	//현재 속도 리턴
	int speed() {
		//return speed; 라고 써도 되지만
		return this.speed;	//가독성 위해 이게 더 좋다
	}
	
	//
	public void run() {
		for(int i = 10; i <= 50; i += 10) {
			this.setSpeed(i);
			System.out.println(model + "가 달립니다.(시속 : " + speed + "km/h)");
		}
		
	}
}

