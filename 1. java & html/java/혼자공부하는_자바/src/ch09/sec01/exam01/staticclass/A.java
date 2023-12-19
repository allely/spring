package ch09.sec01.exam01.staticclass;

public class A {
	static class C{
		C() {
			System.out.println("C 객체가 생성됨");
		}
		int field1;
		static int field2;
		void method1() {
			System.out.println("중첩정적클래스 method1 호출");
		}
		static void method2() {
			System.out.println("중첩정적클래스 정적 method2 호출");
		}
	}
}
