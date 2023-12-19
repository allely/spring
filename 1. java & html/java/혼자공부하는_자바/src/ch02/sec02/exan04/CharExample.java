//다양한 문자 출력방법
package ch02.sec02.exan04;

public class CharExample {

	public static void main(String[] args) {
		char c1 = 'A';			//문자를 직접
		char c2 = 65;			//10진수 코드
		char c3 = '\u0041';		//16진수 유니코드
		
		char c4 = '가';			//한글을 직접
		char c5 = 44032;		//10진수
		char c6 = '\uac00';		//16진수
		
		double d1 = 1_000_000.123_456; 
			//숫자 사이에 ,(콤마)를 넣을 수 없어서 _로 대체
		
		// 이스케이프 시퀀스(escape sequence) "문자의 문자)
		// \" : "문자 출력
		// \' : '문자 출력
		// \\ : \문자 출력
		// /n : 새 행으로 커서 이동
		// \r : 현재 라인의 제일 첫열로 이동
		// \v : 수직 탭
		// \t : 여러 칸을 출력(탭)
		String greeting = "안녕하세요\n \'hello\'\t\t\"Hi!\"";  
		System.out.println(greeting);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println((d1));
	}
}
