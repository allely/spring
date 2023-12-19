package ch07.sec03.exam02;

public abstract class Animal {
	public String kind;
	
	public void breathe() {             //추상메소드
		System.out.println("숨을 쉽니다.");
	}
	
	//울음소리 내는 추상메소드
	//함수정의가 없어서 선언만 있어서 불완전(abstract)하다.
	public abstract void sound();
}
//추상메소드 사용하려면 클래스 선언 시 abstract 사용
//추상메소드 선언 후 자식 클래스에서 재정의하도록 강제함