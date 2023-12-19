package ch06.sec02.exam02;

public class CarExample {

	public static void main(String[] args) {
		//객체 생성
		Car myCar = new Car();
		
		//필드 읽기
		System.out.println("제작회사 : " + myCar.company);
		System.out.println("모델명 : " + myCar.model);
		System.out.println("색상 : " + myCar.color);
		System.out.println("최고속도 : " + myCar.maxSpeed);
		
		//객체의 필드값 변경
		myCar.speed = 60;		//초기화 하지 않아서 0으로 설정
								// =>60으로 변경
		
		System.out.println("현재속도 : " + myCar.speed);	
		
		System.out.println("===========================");
		//객체 생성
		Car myCar1 = new Car();
		
		System.out.println("제작회사 : " + myCar1.company);
		System.out.println("모델명 : " + myCar1.model);
		System.out.println("색상 : " + myCar1.color);
		System.out.println("최고속도 : " + myCar1.maxSpeed);
		System.out.println("현재속도 : " + myCar1.speed);	
		
		//필드값 변경
		myCar1.company = "벤츠";
		myCar1.maxSpeed = 350;
		myCar1.speed = 100;
		//변경 후 필드 읽기
		System.out.println("-----변경 후-----");
		System.out.println("제작회사 : " + myCar1.company);
		System.out.println("모델명 : " + myCar1.model);
		System.out.println("색상 : " + myCar1.color);
		System.out.println("최고속도 : " + myCar1.maxSpeed);
		System.out.println("현재속도 : " + myCar1.speed);	
		
		

	}

}
