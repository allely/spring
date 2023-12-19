package ch05.sec02.exam04.ex1;

public class Ex2ArrayAssignExample {

	public static void main(String[] args) {
		// 1. 크기가 10인 정수형 배열 생성
		//  데이터 모델에 해당 - Model
		int[] s = new int[10];
		
		// 2. 각 배열에는 0부터 9까지의 값으로 채움
		// 실제 데이터를 처리하는 비즈니스로직
				//  Business Logic - Controller라고 부름
		for(int i=0; i<10; i++) {
			s[i] = i;
		}
		
		// 3. 배열의 내용을 출력하세요
		//  Model과 Controller를 이용해서
		//  화면에 출력할 내용을 보여줌 - view
		int count = 0;
		//출력예) 1, 2, 3, ...
		while( count<s.length) {
			System.out.print(s[count] + ", ");
			count++;	
		}
		//배열의 인덱스는 배열의 크기(length)보다 1 작다.
		//배열의 크기값과 같은 인덱스를 사용하려 하면 인덱스 예외 발생
		//s[s.length] = 10;
		//System.out.println("s[" + s.length + "] = " + s[s.length]);
	}
		//// 이런 방식으로 프로그램을 설계해서 작성
		//// MVC(Model-View_Controller)디자인 패턴이라고 합니다.
}

