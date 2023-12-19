package ch09.sec03.exam05;

//지역변수로 사용하는 방법
public class Creature {
	//멤버메소드만 정의
	public void method() {
		//지역변수같이 클래스를 선언하여
		//	일회용으로 사용하기
		//Animal dog는 지역변수 코드실행이 끝나면
		//	메모리로부터 데이터가 소멸(가비지 컬렉션)
		//지역변수의 객체로 선언되었으므로
		//	객체사용(실행)과는 다른 이야기.
		Animal dog = new Animal() {
			public String bark() {
				return "멍멍멍!!!";
			}
		};	//지역변수 객체 생성
		
		//객체를 사용해야 함
		System.out.println(dog.bark());
	}
}