package ch14.sec02.exam01;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
	public static void main(String[] args) throws IOException{
		FileWriter fileWriter = new FileWriter("c:/temp/filedata2.txt");
		
		// 이스케이프문자 \r : 줄의 제일 처음으로
		// 이스케이프문자 \n : 다음줄로
		// 윈도우즈는 \n만 핻 다음줄로 가서 줄의 제일 처음으로.
		// 리눅스에서의 호환성을 위해 둘 다 써 주는 것이 좋다.
		fileWriter.write("안녕하세요\r\n자바는 재밌습니다.\r\n");
		fileWriter.append("Java is good!");
		fileWriter.append("\r\nbyebye");
		
		fileWriter.close();
	}
}