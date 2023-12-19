package ch10.sec02.exam05;

public class ThrowsOtherExample {
	public static void main(String[] args) {
		//예외처리를 한곳에 집중하게 하거나
		//	자바가상머신이 처리하게 해도 되는 예외일 경우
		//	(프로그램을 종료하는데 예외가 발생한다던지)
			findClass();
		
	}
	//실행할 함수를 정의
	//발생한 예외처리를 외부로 부탁하는 경우
	//throws 예외종류, ... 구문을 사용
	//반드시 외부에서 try ~ catch ~ finally 로 처리해야 함
	public static void findClass() throws ClassNotFoundException{
		Class clazz = Class.forName("java.lang.String2");
	}
}