package ch07.sec03.exam02;

public class Dog extends Animal{
	//부모클래스 Animal의 필드 kind를 초기화
	//사용자 정의 기본생성자 함수명() {...} 형식을 기본생성자라고 하고
	//  개발자가 직접 정의했으므로 사용자 기본생성자.
	public Dog() {
		this.kind = "포유류";
	}
	
	//추상메소드 재정의
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}