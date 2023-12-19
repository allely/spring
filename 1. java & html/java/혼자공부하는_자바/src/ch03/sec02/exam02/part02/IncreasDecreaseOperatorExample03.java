package ch03.sec02.exam02.part02;

public class IncreasDecreaseOperatorExample03 {

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
		
		
		//증감연산자와 다른 변수의 상호 작용
		System.out.println("-------------------------");
		z=x++;		//후치증가연산
					//z = x 먼저 실행
					//그 후에 x++(x = x + 1) 실행
					//z변수의 값과 x변수의 값은 +1 차이
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		
		System.out.println("-------------------------");
		z = ++x;	//전치증가연산
					//++x(x = x + 1)먼저 실행
					//
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		
		System.out.println("-------------------------");
		z = ++x + y++;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}

}
