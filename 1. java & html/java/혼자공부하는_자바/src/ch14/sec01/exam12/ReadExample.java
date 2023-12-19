package ch14.sec01.exam12;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample {

	public static void main(String[] args) throws IOException {
		Reader reader = new FileReader("c:/temp/test8.txt");

		// 파일로부터 읽어온 데이터를 저장할 변수
		char[] buffer = new char[100]; // 길이가 100인 배열

		// 파일이 끝에 도달할 때까지 읽기 작업 반복
		while (true) {
			int readCharNum = reader.read(buffer);

			if (readCharNum == -1) {	//더이상 읽을 데이터 없으면 종료
				break;
			}
			
			//파일로부터 읽은 데이터 출력
			for(int i = 0; i < readCharNum; i++) {
				System.out.println(buffer[i]);
			}
		}
		//자원 반납
		reader.close();
	}
}