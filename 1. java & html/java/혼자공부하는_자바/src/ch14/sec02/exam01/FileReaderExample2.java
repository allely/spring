package ch14.sec02.exam01;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample2 {
	public static void main(String[] args) throws IOException {
		// FileReader 사용예제
		// 파일에 있는 내용을 문자방식으로 읽어온다.
		FileReader fileReader = new FileReader("c:/temp/filedata.txt");

		int ch; // 한 글자를 읽어 온다.
				// read()가 한 글자를 리턴할 때 정수값으로 리턴
				// 주의!

		// 파일의 끝에 도착할 때까지 계속 반복
		// 파일의 끝에 도착하면 -1 리턴
		while (true) {
			// 한글자씩 입력스트림으로부터 받아옴
			ch = fileReader.read();

			// 파일의 끝(-1)이면 루프 종료
			if (ch == -1) {
				break;
			}

			// 실제 처리하고 싶은 알고리즘
			// 여기서는 단순하게 출력만.
			// 입력받은 결과가 int형이므로 문자형으로 바꾸려면
			// (char)로 형변환 필요
			System.out.print((char)ch);

		} // 파일처리 while 끝
		
		//파일스트림을 열었으면 반드시 자원 반납
		fileReader.close();
	}
}
// 단순하지만 처리방식에 시간이 더 걸린다.
// 버퍼 사용할 것!