package ch14.sec01.exam09;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {

	public static void main(String[] args) throws IOException {
		Writer writer = new FileWriter("c:/temp/test9.txt");

		char[] array = { 'T', 'O', 'M', '황', '진', '희' };

		writer.write(array, 3, 3); // 3번 인덱스부터 3개를 출력

		writer.flush();

		writer.close();
	}
}