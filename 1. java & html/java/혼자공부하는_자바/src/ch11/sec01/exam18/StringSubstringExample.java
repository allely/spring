package ch11.sec01.exam18;

public class StringSubstringExample {
	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		//Substring(시작인덱스, 끝인덱스)
		//	부분문자열을 가져온다.
		//	시작인덱스부터 끝인덱스 -1까지 가져온다
		//	from(포함) - to(미포함)
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);
		
		//두 번째 구간 숫자의 시작인덱스 7
		//	마지막 숫자의 인덱스는 문자열의 크기
		//	끝까지 하면 뒤의 인덱스는 적지 않아도 된다.
		//		String secondNum = ssn.substring(7);
		String secondNum = ssn.substring(7, ssn.length());
		System.out.println(secondNum);
	}
}