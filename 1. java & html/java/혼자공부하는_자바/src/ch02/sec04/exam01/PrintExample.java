package ch02.sec04.exam01;

public class PrintExample {

	public static void main(String[] args) {
		int value = 123;
		System.out.printf("상품의 가격 : %d원\n", value);
		System.out.printf("상품의 가격 : %6d원\n", value);
		System.out.printf("상품의 가격 : %-6d원\n", value);
		System.out.printf("상품의 가격 : %06d원\n", value);
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이 : %10.2f\n", 10, area);
		
		String name = "홍길동";
		String job = "도적";
		System.out.printf("%6d | %-10s | %10s \n", 1, name, job);
		System.out.printf("1st : %1$03.2f, 2nd : %2$010.2f \n", 100f, 200.00);
		System.out.printf("2st : %2$03.2f, 1nd : %1$010.2f", 100f, 200.00);
	}
}
