package ch10.sec01.exam00;

public class ExceptionExample {

	public static void main(String[] args) {
		String hello = "안녕하세요";
		//정상 출력
		System.out.println(hello);
		
		//hello = "" 대입, 빈문자열이라고 부름
		//	null 아님, 문자열의 크기가 0인 경우
		hello = "";
		
		System.out.println(hello);
		
		//hello = null;
		//	무자열 참조변수가 가리키는 메모리방이 없음
		//	힙에 내용이 없다
		hello = null;
		System.out.println(hello);
		System.out.println(hello.length());		//npe error
	}
}