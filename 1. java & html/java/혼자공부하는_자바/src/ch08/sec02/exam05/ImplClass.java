package ch08.sec02.exam05;

public class ImplClass implements InterfaceC{

	@Override
	public void methodA() {
		System.out.println("ImplementationA-methodA() 실행");
		
	}

	@Override
	public void methodB() {
		System.out.println("ImplementationB-methodB() 실행");
		
	}

	@Override
	public void methodC() {
		System.out.println("ImplementationC-methodC() 실행");
	}
}