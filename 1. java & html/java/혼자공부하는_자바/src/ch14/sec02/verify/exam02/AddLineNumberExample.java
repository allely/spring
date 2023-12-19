package ch14.sec02.verify.exam02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AddLineNumberExample {
	public static void main(String[] args) throws IOException {
		String filePath = "src/ch14/sec02/verify/exam02/AddLineNumberExample.java";

		// filePath경로의 파일을 읽기 위한 스트림을 만든다.
		FileReader fr = new FileReader(filePath);

		// 메인스트림에 기능을 향상하려는 것이므로
		// 	메인스트림의 참조변수가 매개변수로 전달 필요
		BufferedReader br = new BufferedReader(fr);
		
		// 소스코드를 읽어서 각 코드에 라인넘버를 추가한다.
		// 소스코드의 줄 수만큼 반복한다.	- 반복문 필요
		//		반복되는 횟수가 정해지지 않았다. - while
		// Reader 문자스트림클래스는 한 줄을 읽기 위한 메소드가 준비됨.
		//										readLine()
		// Reader.readLine() : \r or \n 만날 때까지 내용을 읽어 온다.
		
		// Reader,readLine()함수로 한글 읽은 결과물을 저장할 문자열변수
		//   Reader.readLine()으로 결과가 없으면 힙에 문자열객체가 없으므로 null환
		String lineString;
		int rowNumber = 0;	//처음에는 소스코드를 안읽었으므로 0
		while(true) {
			//더이상 파일의 내용이 없으므로 while루프를 빠져나감
			if( (lineString = br.readLine()) == null) {
				break;
			}
			
			// 파일에서 한 줄 읽어 왔으므로 rowNumber = rowNuber + 1
			// rowNumber : 현재 줄 수
			//":" : 구분기호
			//linrString 파일에서 읽은 한 줄
			System.out.println((++rowNumber) + ": " + lineString);
		}
		
		//입출력스트림 정리
		br.close();
		fr.close();
	}
}