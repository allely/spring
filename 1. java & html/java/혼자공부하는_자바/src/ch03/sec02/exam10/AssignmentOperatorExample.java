//대입연산자
package ch03.sec02.exam10;

public class AssignmentOperatorExample {

	public static void main(String[] args) {
		int result = 0;
		result += 10;
		System.out.println("result = " + result);
		result -= 5;
		System.out.println("result = " + result);
		result *= 3;
		System.out.println("result = " + result);
		result /= 5;
		System.out.println("result = " + result);
		result %= 3;
		System.out.println("result = " + result);
	}
}