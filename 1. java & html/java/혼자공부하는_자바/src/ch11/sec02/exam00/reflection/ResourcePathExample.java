package ch11.sec02.exam00.reflection;

import java.io.UnsupportedEncodingException;

public class ResourcePathExample {
	public static void main(String[] args) throws UnsupportedEncodingException {
		//Car 바이트코드와 ResourcePathExample바이트코드가 
		//	같은 패키지 밑에 있으므로
		//	간단한 바이트 불러오기 방법1 사용
		Class clazz = Car.class;
		
		//photo1.jpg경로 얻기
		String photo1Path = clazz.getResource("photo1.jpg").getPath();
		System.out.println(photo1Path);
		
		//한글경로인 경우 경로문자열이 꺠져서 출력
		// 해결하려면
		//보통 리소스 경로명은 인터넷(=네트워크)를 이용해서
		//	자원을 사용하려 할 때 제일 많이 사용되므로
		//	자바 네트워크 라이브러리에 만들어져 있다.
		//java.net : 자바 네트워크관련 기능 라이브러리
		//java.net.URLDecoder : 네트워크를 통해서 문자열을 교환할 때
		//	문자열을 변환하는 기능을 담당
		//java.net.URLDecoder.decode(변한문자열, "코드체계")
		//	변환문자열을 코드체계(UTF-8 등)로 변환한다.
		photo1Path = java.net.URLDecoder.decode(photo1Path, "UTF-8");
		System.out.println(photo1Path);
		
		//images/photo2.jpg 경로 얻기
		String photo2Path = clazz.getResource("images/photo2.jpg").getPath();
		System.out.println(photo2Path);
	}
}