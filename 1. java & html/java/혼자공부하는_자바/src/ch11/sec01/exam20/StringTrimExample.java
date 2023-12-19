package ch11.sec01.exam20;

public class StringTrimExample {
	public static void main(String[] args) {
		String tel1 = " 02";
		String tel2 = "123   ";
		String tel3 = "    1234   ";
		
		//좌측공백 제거 + 우층공백 제거 + 좌우공백 제거
		String tel = tel1.trim() + tel2.trim() + tel3.trim();
		
		//공백제거 전
		System.out.println(tel1 + tel2 + tel3);
		
		//공백제거 후
		System.out.println(tel);
		
		//replace를 이용해서 공백제거하기
		//	문자열 중간의 여백을 제거하고 싶을 때 사용
		//	예) "  0 2 2 2112  22  22  0"
		//		=>"022211222220"
		System.out.println(tel1.replace(" ", "") 
					+ tel2.replace(" ", "") 
					+ tel3.replace(" ", ""));
	}
}