package ch03.sec02.exam02.part03;

public class IncreasDecreaseOperatorExample02 {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z=0;
		
		System.out.println("------복합 증감 연산-------");
		System.out.println("증가연산 전 기본값 z = " + z);
		System.out.println("증가연산 전 기본값 x = " + x);
		System.out.println("증가연산 전 기본값 y = " + y);
		
		z = x++ + ++y;
		System.out.println("z = x++ + ++y 연산 후");
		
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	
		z = x++ + ++y + x++;
		System.out.println("z = x++ + ++y + x++ 연산 후");
		
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}


