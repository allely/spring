package ch06.sec00.string;

public class StringExample1 {

	public static void main(String[] args) {
		//문자열 선언
		String proverb = "A Barking dog";	//new 연산자 생략
		String s1;	//문자열 결합 저장 변수
		String s2;	//문자 교환 
		String s3;	//부분문자열 구하기
		String s4;	//대문자로 교환
		
		// proverb + " never Bites!"
		s1 = proverb.concat("never bites!");
		
		// 'B'를 'b'로 고침
		s2 = proverb.replace('B', 'b');
		
		//인덱스 2부터 인덱스 5까지의 부분문자열 가져옴 
		s3 = proverb.substring(2,5);	// 2 - 4 까지만, 5번째 안들어감
										// from ~ to : from 포함, to 미포함
		
		//대문자로 변경
		s4 = proverb.toUpperCase();
		
		//변환 결과 출력
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
}
