package ch02.sec04.exam02;

public class MethodCallingExam {
	
	//입력값으로 넘어온 매개변수 x, y를 더한 결과 반환
	public static int add(int x, int y ) {
		return (x+y);
	}
	
	//자바 가상머신에서 프로그램이 호출되는(=CallBack) main() 정의
	public static void main(String[] args) {
		int x = 110;
		int y = 230;
		
		//add메소드 실행(=메소드 호출 (Method call))
		int result = add(x,y);
		
		System.out.printf("%d + %d = %d", x, y, result);
	}
}
