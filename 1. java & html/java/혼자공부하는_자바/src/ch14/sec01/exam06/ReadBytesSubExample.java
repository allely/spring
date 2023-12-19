package ch14.sec01.exam06;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadBytesSubExample {

	public static void main(String[] args) throws IOException{
		InputStream is = new FileInputStream("c:/temp/test3.db");
		
		byte[] buffer = new byte[5];
		
		// 입력스트림 is로부터 3바이트를 읽어서 
		//	buffer[2], buffer[3], buffer[4]에 각가 저장
		int readByteNum = is.read(buffer, 2, 3);
		
		// is로부터 더이상 읽을 데이터가 없으면
		//	readByteNum은 -1을 리턴
		if(readByteNum != -1) {	// 읽을 데이터가 있으면
			for(int i = 0; i < buffer.length; i++) {
				System.out.println(buffer[i]);
			}	// 배열 전체를 읽어서 출력하는 루프
		}
		//입력스트리 종료
		is.close();
	}
}