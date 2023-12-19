package ch07.extra.exam01;

public class PolymorphismExample {
	///다형성 (=Polymorphism) :
	/// - 다양한 객체(데이터형_에서 같은 기능을 구현하는 것
	///	- 반환형식 메소드이름(매개변수 형식) 똑같아야 함
	/// - 다형성에 기본 특징 메소드 재정의(Overriding)
	
	public static void main(String[] args) {
		JavaProgramming javaProg = new JavaProgramming();
		
		Programming prog = javaProg;
		
	}
}
