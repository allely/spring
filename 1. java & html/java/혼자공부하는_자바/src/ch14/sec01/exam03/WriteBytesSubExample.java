package ch14.sec01.exam03;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteBytesSubExample {
	public static void main(String[] args) throws IOException {
		OutputStream os = new FileOutputStream("c:/temp/test3.db");
		
		byte[] bytes = { 10, 20, 30, 40, 50 };
		
		os.write(bytes, 1, 3);	//1번인덱스 ~ 3번인덱스 출력
		
		//잔여데이터 출력해서 버퍼 비우기
		os.flush();
		
		//다 사용한 스트림 자원 반납
		os.close();
	}
}