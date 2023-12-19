package ch07.sec00.exam00;

public class Child extends Parent{
	//자손 클래스의 필드
	public String cstr1 = "1";
	private String cstr2 = "2";
	
	//자손 클래스의 생성자
	public Child() {
		
	}
	
	private Child(String str) {
		cstr1 = str;
	}
	
	//메소드 매개변수가 없는 경우
	public int method4() {
		System.out.println("method4 매개변수 없음");
		return 0;
	}
	//자손 클래스의 메소드	
	public int method4(int n) {
		System.out.println("method4 : " + n);
		return n;
	}
	
	private int method5(int n) {
		System.out.println("method5 : " + n);
		return n;
	}
}