package ch07.sec01.exam07.pack1;

public class B {
	public void method() {
		A a = new A();			//같은 패키지 안에 있으면 접근가능
		a.field = "value";
		a.method();
	}
}
