package ch07.sec02.exam01;
///다형성 클래스들1
////////////////////////////
class A{}
class B extends A{}
class C extends A{}

//다형성 테스트용 클래스
public class PromotionExample {

	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		
		D d = new D();
		E e = new E();
		
		
		//각 객체를 상위 부모객체를 가리키도록 설정
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
		
//		B b3 = e;	//	상속관계에 있지 않기 때문에 컴파일 에러
//		C c2 = d;	//

	}

}

//////////////////////////////
//다형성 클래스들
//////////////////////
class D extends B{}
class E extends C{}