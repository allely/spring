package ch02.sec04.exam04;

import java.io.IOException;

public class QStopExample {

	public static void main(String[] args) throws IOException {
		//. 키코드를 저장한 변수
		int keyCode;
		
		boolean isRunning = true;

		//1.5 키코드 읽기 무한 반복
		while(isRunning) {
			//2. 키보드로부터 키코드 값을 읽어온다
			keyCode = System.in.read();
			//3. 화면에 출력
			System.out.println("keyCode : " + keyCode);
			//3.5 만약 입력한 키코드가 'q'이면 반복 중지
			if(keyCode == 113) {	//코드번호 = 113 = 'q'
				isRunning = false; // 조건식에 의해 자연스럽게 종료
				//break; // 반복문을 강제로 종료
			}
		}
		System.out.println("종료");
	}
}