package ch07.sec01.exam03;

public class Computer extends Calculator{
	//메소드 재정의(오버라이딩)
	//부모클래스의 메소드와 메소드이름, 반환형, 매개변수가 같아야 한다.
	//메소드를 상속받았고, 재정의함을 확인
	//상속받은 메소드와 이름, 반환형, 매개변수가 다르다면 오류
	@Override	//실행주석(@~)은 내부적으로 클래스입니다.
				//따라서 @다음에 대문자로 시작합니다
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
}
