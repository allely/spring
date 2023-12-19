package ch03.sec02.exam07;

public class CompareOperationExample {
	//문자형도 크기 비교 가능
	public static void main(String[] args) {
		char char1 = 'A';
		char char2 = 'B';
		int i = 100;
		
		boolean result4 = (char1 < char2);
		boolean result5 = (char1 < i);
		System.out.println("result : " +result4);
		System.out.println("result5 : " +result5);
	}
}
