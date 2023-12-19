package ch07.sec01.exam07.pack2;

import ch07.sec01.exam07.pack1.A;

public class C {
	public void method() {
		A a = new A();			//다른 패키지에 있으면 접근 불가능
		a.field = "value";
		a.method();
	}
}
