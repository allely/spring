package ch07.sec02.exam02;

public class Child extends Parent{
	@Override
	public void method2() {
		System.out.println("Child-method2()");
	}
	
	//자식클래스의 고유 메소드
	public void method3() {
		System.out.println("Child-method3()");
	}
}
