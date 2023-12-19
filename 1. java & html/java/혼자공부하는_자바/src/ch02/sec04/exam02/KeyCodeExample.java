package ch02.sec04.exam02;

public class KeyCodeExample {

	public static void main(String[] args) throws Exception{
		int keyCode;
		
		//안내문자열
		System.out.println("키보드로부터 한글자를 입력해주세요 :) (엔터키를 눌러주세요)");
		//처리부+입력부
		keyCode = System.in.read();
		System.out.println("keyCode : " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode : " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode : " + keyCode);
	}
}
