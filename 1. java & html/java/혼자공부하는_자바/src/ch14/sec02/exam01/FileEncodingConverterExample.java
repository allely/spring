package ch14.sec02.exam01;
//문자열 ANSI(아스키) => UTF-8(유니코드) 변환하여 저장
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FileEncodingConverterExample {
	public static void main(String[] args) throws IOException{
		
		// 1. 변환할 인코딩 파일을 읽어온다.
		//	바이트스트림으로 읽어와서
		//	문자스트림리더로 설정하여(내용물이 텍스트이므로)
		//	버퍼리더로 최종 읽기 속도를 높인다.
		FileInputStream input = new FileInputStream("c:/temp/StreamData.txt");
		InputStreamReader reader = new InputStreamReader(input, "EUC-KR");
		BufferedReader bufferReader = new BufferedReader(reader);
		
		// 2. 읽어온 파일을 인코딩변환하여 저장할 출력파일 생성.
		FileOutputStream output = new FileOutputStream("c:/temp/StreamData-UTF-8.txt");
		OutputStreamWriter writer = new OutputStreamWriter(output, "UTF-8");
		BufferedWriter bufferWriter = new BufferedWriter(writer);
		
		// 3. 입력스트림으로부터 파일의 내용을 한 글자씩 읽어오면서
		//		출력스트림에 쓰기 작업을 한다.
		//	파일 읽어오는 반복문 필요

		//	속도를 올리기 위해 bufferedReader(운영체제 관리, 속도 편차 있음)와 별개로
		//			작은 메모리공간(버퍼)(사용자관리, 속도 안정적)를 추가로 만든다.
		final int BUFFER_SIZE = 1024;
		char[] chars = new char[BUFFER_SIZE];
		
		while(true) {
			int readCharNum = bufferReader.read(chars);
			if(readCharNum != -1) {
				bufferWriter.write(chars);
			} else {
				break;
			}
		}
		
		// 4. 변환이 끝나면 사용한 자원(입력/출력스트림)을 닫는다.
		bufferWriter.flush();
		
		bufferReader.close();
		bufferWriter.close();
		
		reader.close();
		writer.close();
		
		input.close();
		output.close();
	}
}
