package ch14.sec01.exam11;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample {

	public static void main(String[] args) throws IOException {
		Reader reader = new FileReader("c:/temp/test7.txt");

		// 파일의 사이즈를 현재 모르므로
		// 	while 무한 루프
		while (true) {
			// 파일로부터 1글자 읽는다.
			int data = reader.read();

			if (data == -1) {
				break;
			}
			
			// 읽은 데이터 처리
			System.out.println( (char)data);
		} // while end
		
		reader.close();
	}
}
//A, B, C ==(읽기)==> 65, 66, 67 ==(강제형변환, 출력)==> A, B, C