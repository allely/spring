package ch07.sec00.exam00;

public class Parent {
	//필드
	private String str1 = "1";
	public String str2 = "2";
	
	//생성자
	public Parent() {
		
	}
	
	//메소드
	private void method() {
		System.out.println("method1");
	}
	
	public void method2(int n) {
		System.out.println("method2 : " + n);
	}
	
	private void method3(int a, int b) {
		System.out.println("method3 : " 
				+ a + " + " + b + " = " + (a + b));
	}
}