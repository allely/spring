package ch14.sec01.exam10;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {

	public static void main(String[] args) throws IOException{
		Writer writer = new FileWriter("c:/temp/test10.txt");
		
		//문자열 출력
		String str = "안녕하세요.자바입니다.";
		
		writer.write(str);
		
		writer.flush();
		
		writer.close();
	}
}