package ch02.sec04.exam03;

public class ContinueKeyCodeReadExample {

	public static void main(String[] args) throws Exception {
		int keyCode;
		boolean isRunning = true;
		
		
		while(isRunning) {
			keyCode = System.in.read();
			System.out.println("keyCode : " + keyCode);
		}
	}
}
