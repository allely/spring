package ch11.sec01.exam14;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {
	public static void main(String[] args) {
		String str = "안녕하세요";

		// "안녕하세요"문자열을 바이트배열로 만들기
		// 암호화( Encoding ) :
		// 원래내용을 어떤 규칙을 이용해서 다른 내용으로 만드는 것
		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1내용: " + bytes1);
		for (var ch : bytes1) {
			System.out.print(ch);
		}
		System.out.println();
		System.out.println("bytes1.length : " + bytes1.length);

		// 복호화( Decoding ) :
		// 암호화된 내용을 다시 원래내용으로 변경함
		String str1 = new String("bytes1 => String : " + bytes1);//??수정
		System.out.println(str1);


		
		try {
			// "안녕하세요" => EUC-KR 방식으로 배열화
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println("bytes2.length : " + bytes2.length);
			// EUC-KR방식으로 배열화 => "안녕하세요"
			String str2 = new String(bytes2, "EUC-KR");
			System.out.println("bytes => String : " + str2);

			// "안녕하세요" => 유니코드(utf-8) 방식으로 배열화
			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println("bytes3.length : " + bytes3.length);
			// 유니코드(utf-8)방식으로 배열화 => "안녕하세요"
			String str3 = new String(bytes3, "UTF-8");
			System.out.println("bytes => String : " + str3);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}