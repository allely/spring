package ch03.sec02.exam05;

public class CharOperationExample {

	public static void main(String[] args) {
		char c1 = 'A' + 1;	// 선언 시점(초기화하는 시점)에서는 형 변환이 일어나지 않음
							// char로 선언하기 때문
							// char로도 int로도 저장될 수 있음
							// 초기화와 대입은 다르다
		char c2 = 'A';
		//char c3 = c2 + 1;		
					//연산결과 int(c2+1)이 char형 변수에 저장될 수 없음
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		//System.out.println("c3 : " + c3);

	}
}
