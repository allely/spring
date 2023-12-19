package ch08.sec02.exam05;

public class MultiInterfaceExample {

	public static void main(String[] args) {
		//구현클래스 ImplClass 객체 생성
		ImplClass implClass = new ImplClass();
		
		//implCLassA 객체를 통하여 메소드 호출
		implClass.methodA();
		implClass.methodB();
		implClass.methodC();
		
		//InterfaceA 타입으로 참조하는 경우
		InterfaceA ia = implClass;
		ia.methodA();
		System.out.println();
		
		//InterfaceB 타입으로 참조하는 경우
		InterfaceB ib = implClass;
		ib.methodB();
		System.out.println();
		
		//InterfaceC 타입으로 참조하는 경우
		InterfaceC ic = implClass;
		ic.methodC();		//InterfaceC 자기자신의 메소드 methodC()
		ic.methodA();		//InterfaceC가 InterfaceA를 상속했으므로 methodA() 사용 가능
		ic.methodB();		//InterfaceC가 InterfaceB를 상속했으므로 methodB() 사용 가능
		System.out.println();
	}
}