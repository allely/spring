package ch03.sec02.exam02.part01;

public class IncreasDecreaseOperatorExample {
	//전치연산, 후치연산
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		//구분선 출력
		System.out.println("-------------------------");
		System.out.println("증가연산 전 기본값 x = " + x);
		x++;//후치 증가 연산
		System.out.println("후치증가연산 x++ = " + x);
		++x;//전치 증가 연산
		System.out.println("전치증가연산 ++x = " + x);
		System.out.println("x = " + x);
		
		System.out.println("-------------------------");
		System.out.println("증가연산 전 기본값 y = " + y);
		y--;//후치 증가 연산
		System.out.println("후치감소연산 y-- = " + y);
		--y;//전치 증가 연산
		System.out.println("전치감소연산 --y = " + y);
		System.out.println("y = " + y);
		
		System.out.println("-------------------------");
		z=x++;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		
		System.out.println("-------------------------");
		z = ++x;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		
		System.out.println("-------------------------");
		z = ++x + y++;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}

}
