package ch02.sec03.exam07;

public class PrimitiveAndStringConversionExample {
	public static void main(String[] args) {
		
	
		//문자열을 다른 자료형으로 변환
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.printf("value1 : %s \n", value1);
		System.out.printf("value2 : %s \n", value2);
		System.out.printf("value3 : %s \n", value3);
		
		//여러 자료형을 문자열로 변환
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);
		
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
		
		String strValue = "A";
		
		char var = (char)strValue;
		
//		//확인문제 5번
//		char c1 = 'a';
//		char c2= (char)(c1 + 1);
//		System.out.println(c2);
//		
//		//확인문제 9
//		long var1 = 2L;
//		float var2 = 1.8F;
//		double var3 = 2.5;
//		String var4 = "3.9";
//		int result = (int)(var1 + var2 + var3 + (int)Double.parseDouble(var4));
//		
//		System.out.println(result);
	}
}
