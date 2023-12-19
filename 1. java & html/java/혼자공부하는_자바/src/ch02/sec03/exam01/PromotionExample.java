package ch02.sec03.exam01;

public class PromotionExample {

	public static void main(String[] args) {
		//자동 타입 변환
		//작은 허용 범위 타입에서 큰 허용 범위 타입으로 변환될 수 있다.
		
		//byte타입에서 int타입으로
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue = " + intValue);
		
		//char타입에서 int타입으로
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드 : " + intValue);
		
		//int타입에서 long타입으로
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue : " + longValue);
		
		//long타입에서 float타입으로
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue : " + floatValue);
		
		//float타입에서 double타입으로
		floatValue = 100.5f;
		double doubleValue = floatValue;
		System.out.println("doubleValue : " + doubleValue);
	}
}
		//byte 타입에서 char 타입으로 변환할 수 없는 이유는
		//char타입은 음수를 포함하지 않기 때문이다.