package ch14.sec02.exam01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharacterConvertStreamExample {

	public static void main(String[] args) throws Exception{
		write("문자 변환 스트림을 사용합니다.");
		String data = read();
		System.out.println(data);

	}

	public static void write(String string) throws IOException {
		// 보조스트림 연결
		FileOutputStream fos = new FileOutputStream("c:/temp/test1.txt");
		Writer writer = new OutputStreamWriter(fos);
		
		// 보조스트림을 이용해 문자 출력
		writer.write(string);		
		writer.flush();
		
		writer.close();
	}
	
	public static String read() throws Exception{
		// 보조스트림 연결
		FileInputStream fis = new FileInputStream("c:/temp/test1.txt");
		Reader reader = new InputStreamReader(fis);
		
		char[] buffer = new char[100];
		
		// 보조스트림 이용해서 문자 입력
		int readCharNum = reader.read(buffer);
		reader.close();
		
		// char 배열에서 읽은 수만큼 문자열로 변환
		String data = new String(buffer, 0, readCharNum);
		
		return data;
	}
}