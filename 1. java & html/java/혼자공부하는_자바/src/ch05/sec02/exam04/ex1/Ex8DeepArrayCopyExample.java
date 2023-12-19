package ch05.sec02.exam04.ex1;

public class Ex8DeepArrayCopyExample {

	public static void main(String[] args) {
		//원본 배열
		int[] list = {10, 20, 30, 40, 50};
		
		//복사본배열
		//깊은 복사는 고
		//    1. 공간(주소)를 확보해야 한다.
		//    2. 복사할 원본과 크기가 같아야 하므로 배열타입 크기만큼
		//      new 배열타입[원본의 배열크기] 으로 공간확보가 필요
		//    3. 루프를 통하여 원본의 개별요소를 복사본의 개별요소에
		//      저장해준다.
		int[] numbers = new int[list.length];	//
		
		//원본의 갯수만큼 복사를 한다
		for(int i =0; i <list.length; i++) {
			numbers[i] = list[i];
		}
		
		// 원본배열의 내용정보를 보여주는 toString() 출력
		// 복사본배열의 내용정보를 보여주는 toString() 출력 (해시코드)
		System.out.println(list.toString());
		System.out.println(numbers.toString());

		//비교연산자를 사용하여 정확한 비교를 해보자
		if(list == numbers) {
			System.out.println("list == numbers");
		} else {
			System.out.println("list != numbers");
		}
		
		//3. 두 배열의 내용을 출력
		System.out.println("====================");
		for(int i =0; i <list.length; i++) {
			System.out.println(list[i] + "\t" + numbers[i]);
		}
		
		//4.복사본의 배열요소를 고치면 원본에, 
		//  원본을 고치면 복사본에 영향이 있는지?
		for(int i = 0; i<list.length; i++) {
			numbers[i] = 0;
		}
		System.out.println("====================");
		for(int i = 0; i<list.length; i++) {
			System.out.println(list[i] + "\t" + numbers[i]);
		}
		//결론 : 영향 없다.
	}
	
}

