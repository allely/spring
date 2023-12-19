package ch05.sec02.exam04.ex1;

public class Ex7ArrayShallowCopyExample {

	public static void main(String[] args) {
		
		int[] list = {10, 20, 30, 40, 50};
		//얕은복사(Shallow copy)를 이용한 배열요소 복사
		int[] numbers = list;
		
		//원본배열 출력
		for(int number : list) {
			System.out.println(number);
		}
		System.out.println("--------------------------");
		
		//복사된 배열 출력
		for(int number : numbers) {
			System.out.println(number);
		}
		System.out.println("--------------------------");
		
		//numbers와 list가 서로 같은가 참조비교
		if(list == numbers) {
			System.out.println("list배열과 numbers배열이 완전히 같습니다.");
		} else {
			System.out.println("list배열과 numbers배열이 다릅니다.");
		}
		//내용을 비교하는 equals() 메소드 확인
		if(list.equals(numbers)) {
			System.out.println("list배열과 numbers배열이 같습니다.");
		} else {
			System.out.println("list배열과 numbers배열이 다릅니다.");
		}
		
		//numbers와 list의 개별 배열요소를 비교
		for(int i = 0; i < list.length; i++) {
			if(list[i] == numbers[i]) {
				System.out.println("list와 numbers의 개별요소가 같습니다.");
			} else {
				System.out.println("list와 numbers의 개별요소가 다릅니다.");
			}
			
		}
		System.out.println("=============================================");
		//데이터객체의 정보의 특징을 해쉬값으로 출력
		System.out.println(list.toString());		//해쉬값(해쉬코드): 유일
		System.out.println(numbers.toString());		//두 출력이 같다 = 같은것으로 비교하고 있었다.
		
		
		//list = null; //list가 가리키는 곳이 없어지기 떄문에 출력에 오류
		//System.out.println(list.toString());		
		System.out.println(numbers.toString());		//list=null 해도 numbers에는 남아있다.
		//힙 위치를 가리키는 list, list를 복사한 numbers
		
		//복사본 numbers의 데이터값을 데이터요소 * 10을 해서 내용을 바꾼다.
		//list 원본에 영향이 있을지 살펴본다.
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = numbers[i] * 10;
		}
		
		//numbers배열의 내용이 바뀌었는지 확인
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		System.out.println("================================");
		//원본 list배열의 내용이 바뀌었는지 확인
		for(int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
		/* 
		 * 결론
		 * 참조복사(얕은 복사)는 같은 메모리를 가르킨다.
		 * 같은 내용물을 가르킨다.
		 * list == numbers
		 * 복사본 변경하면 원본에 영향
		 * 원본 변경하면 복사본에 영향
		 */
	}

}
