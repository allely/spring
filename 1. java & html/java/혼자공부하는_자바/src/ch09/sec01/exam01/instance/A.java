//instance - static - local 순

package ch09.sec01.exam01.instance;

public class A {
	A(){
		System.out.println("A객체가 생성됨");
	}
	
	//인스턴스 멤버 클래스
	class B {
		//중첩클래스 B용 생성자
		B () {
			System.out.println("B객체가 생성됨");
		}
		//중첩클래스 B용 필드
		int field1;
		//중첩클래스 B용 정적필드 가능?
		static int field2;
		//중첩클래스 B용 메소드
		void method1() {
			System.out.println("중첩객체 B의 method1() 실행");
		}
		//중첩클래스 B용 정적 메소드 가능?
		static void method2() {
			System.out.println("중첩객체 B의 정적 method2() 실행");
		}
	}	
}