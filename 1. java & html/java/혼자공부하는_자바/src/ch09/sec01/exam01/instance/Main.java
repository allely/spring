package ch09.sec01.exam01.instance;

public class Main {
	public static void main(String[] args) {
		A a = new A();	//A객체를 생성
		
		//인스턴스 멤버 클래스 객체 생성
		//A.B : A 클래스의 B사용자정의타입
		//A.B b : A.B타입의 참조변수 b선언
		//a.new B();
		//		a참조변수가 가리키는 A타입의 객체 안에
		//		중첩클래스 B의 새로운 서브 방을 만듦
		A.B b = a.new B();
		
		//만들어진 객체를 사용
		b.field1 = 3;	//b객체의 field1에 3 대입
		b.method1();
		b.field2 = 5;
		b.method2();
	}
}