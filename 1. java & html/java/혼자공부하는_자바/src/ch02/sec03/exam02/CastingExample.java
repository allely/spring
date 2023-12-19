package ch02.sec03.exam02;

public class CastingExample {

	public static void main(String[] args) {
		int intValue = 44032;
		char charValue = (char)intValue;	
		//int 4byte, char 2byte
		//int -> char로 강제 타입 변환하면 
		//상위 2개byte는 버리고(??) 하위 2개byte를 남긴다
		
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int)longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);
	}
}
