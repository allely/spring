package ch03.sec02.problem10;

public class CircleAreaExample {
	//문자열끼리 더하면 문자열이 이어진다.
	//숫자로 된 문자열을 실수로 변환하여 연산할 수 있다.
	public static void main(String[] args) {
		int var1 = 10;
		int var2 = 3;
		int var3 = 14;
		double var4= var1 * var1 * Double.parseDouble(var2 + "." + var3);
		System.out.println("원의 넓이 :" + var4);
	}
}
