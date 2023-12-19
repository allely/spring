package ch02.sec03.exam05;

public class OperationPromotionExample {

	public static void main(String[] args) {
		/*
		int x=1;
		int y=2;
		double result = x / y;
		System.out.println(result);		
		//x/y는 0.5이지만 int형이기 떄문에 0으로 인식, 그 후 double형으로 변환되어 result에 입력된다
		
		///x, y를 강제 더블형 변환
		result = (double)x/y;
		System.out.println("(double)x/y = " + result);
		//저장되는 장소의 자료형에 맞춰 변환하여 하는 편이 정확하다.
		*/
		
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		//byte byteValue3 = byteValue + byteValue;		//byte형은 연산할 때 int형으로 자동 변환되기 때문에 
		int intValue1 = byteValue1 + byteValue2;		//byte형으로 저장하려면 (byte)(x+y)같은 식으로 해야한다.
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		//char charValue3 = charValue1 + charValue2;		//char형도 마찬가지
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드 = " + intValue2);
		System.out.println("추력문자 = " + (char)intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println(intValue4);
		
		int intValue5 = 10;
		//int intValue6 = 10 / 4.0;				//double형으로 전환되어 저장
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);
		
		int x = 1;
		int y = 2;
		double result = (double) x / y;
		System.out.println(result);
	}
}
