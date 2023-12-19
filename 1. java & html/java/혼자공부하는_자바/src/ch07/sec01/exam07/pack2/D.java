package ch07.sec01.exam07.pack2;

import ch07.sec01.exam07.pack1.A;

public class D extends A{
	public D() {
		super();		//부모객체 초기화		
		this.field = "value";	//다른 패키지에 있지만
		this.method();			//자식 생성자에서는 super()로 접근 가능
	}
}