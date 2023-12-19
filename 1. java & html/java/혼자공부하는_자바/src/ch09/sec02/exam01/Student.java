package ch09.sec02.exam01;

public class Student extends Person{
	//부모클래스로부터 상속받은 메소드를 재정의해야 하한다고
	//	자바가 문법적으로 강조
	@Override
	void wake() {
		System.out.println("9시에 일어납니다.");
		study();
	}

	private void study() {
		System.out.println("이제부터 공부를 합니다.");		
	}
}
