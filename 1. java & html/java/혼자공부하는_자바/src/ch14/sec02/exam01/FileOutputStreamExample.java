package ch14.sec02.exam01;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class FileOutputStreamExample {
	public static void main(String[] args) throws IOException{
		// 1. 바이트방식 파일 스트림을 먼저 만든다.
		//	 사용예)
		//	 		fileOutputStream("파일경로", 추가가능여부)
		//				추가가능여부 : true = 이어서 씀, false = 새로 씀
		FileOutputStream output = new FileOutputStream("c:/temp/StreamData.txt", true);
		
		// 2. 이 스트림에 OutputStreamWriter 보조스트림을 연결,
		//	 	바이트방식스트림을 문자열 스트림처럼 다룬다.
		//	new OutputStreamWriter(출력바이트스트림, 인코딩문자형식);
		//	출력스트림을 UTF-8 방식으로 변환하여 출력.
		//	실제로 끝점(End-Point)의 출력방식이 파일출력스트림이므로
		//		파일로 저장됨		  
		OutputStreamWriter writer = new OutputStreamWriter(output,"UTF-8");
		
		// 작업 후 추가
		// 참조변수가 다른 인코딩방식 객체를 가리키도록 바꾸면?
//		writer = new OutputStreamWriter(output, "EUC-KR");
		// utf-8방식으로 쓴 문자들이 깨짐
		// 그 후 다시 utf-8로 쓴다면? => 깨짐
		
		// 3. 이 스트림들에 다시 쓰기 속도를 올리기 위해
		//	 버퍼를 이용하여 한꺼번에 버퍼를 쓰기 작업한다.
		BufferedWriter out = new BufferedWriter(writer);

		// 4. 프로그램 => 버퍼쓰기스트림 => 문자쓰기스트림 => 바이트쓰기스트림
		out.write("안녕하세요");
		out.write("\r\n저는 자바입니다.");
		out.append("저는 인터넷에 강한 언어입니다.\r");
		out.append("\n강력한 보안성능을 자랑합니다.");
		
		// 5. 다 사용한 입출력 자원은 항상 닫아야 한다.
		out.close();
	}
}