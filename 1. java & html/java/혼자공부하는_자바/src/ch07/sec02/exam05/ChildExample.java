package ch07.sec02.exam05;

public class ChildExample {
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "data1";	// 자동 타입 변환
		parent.method1();
		parent.method2();
//		parent.method3();	
			// 자식 타입이 부모 타입으로 자동 변환하면, 
			//부모에 선언된 필드와 메소드만 사용 가능하다.
		
		
		Child child = (Child)parent;
		child.field2 = "new data1";	// 강제 타입 변환
		child.method1();
		child.method2();
		child.method3();
			.
	}
}