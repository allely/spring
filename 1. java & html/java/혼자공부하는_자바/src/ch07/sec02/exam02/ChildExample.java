package ch07.sec02.exam02;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();

		//부모 타입으로 자식객체를 가리킴
		Parent parent = child;		//자동 타입 변환
		
		//이 참조변수로 각 메소드를 부르면?
		parent.method1();	//부모객체만 가지고 있으므로
							//부모 객체의 메소드가 불린다.
		parent.method2();	//자식 객체에서 재정의된 메소드 호출
//		parent.method3();	//자식 객체의 고유 메소드이므로 호출 불가능
	}
}
