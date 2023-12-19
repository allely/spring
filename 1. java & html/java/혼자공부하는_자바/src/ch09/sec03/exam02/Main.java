package ch09.sec03.exam02;

public class Main {
	public static void main(String[] args) {
		//익명 클래스 : 클래스 정의 + 객체 생성
		// 클래스 정의와 객체화를 한번에(동시에).
		//	그러므로 일회성임.
		Animal dog = new Animal() {
			@Override
			public String bark() {
				return "강아지가 짖습니다.";
			}
		};	//주의할 점은 익명클래스는 객체를 생성하므로 문장실행임
			//	따라서 반드시 세미콜론(;) 필요
		System.out.println(dog.bark());
	}
}