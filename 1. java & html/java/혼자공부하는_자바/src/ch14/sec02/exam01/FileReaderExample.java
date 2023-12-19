package ch14.sec02.exam01;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
	public static void main(String[] args) throws IOException {
		
		FileReader fileReader = new FileReader("c:/temp/filedata.txt");

		int ch; 

		// 1. FileReader로부터 한 글자를 읽어온다
		//   ch = fileReader.read();
		// 2. ch변수가 -1과 같다면 파일의 끝
		//   아니면 계속 파일로부터 한 글자를 읽어온다.
		// 3. 루프를 계속 돌려면 ch != -1 이면 된다.
		// 4. 위의 두 식을 합치면
		//	  ((ch = fileReader.read()) != -1)
		while ((ch = fileReader.read()) != -1) {

			System.out.print((char)ch);

		} // while 끝
		
		fileReader.close();
	}
}
// 프로그램의 흐름을 해치지 않기 위해서 
// while문 안에 조건식을 사용