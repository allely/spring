package ch11.sec01.exam06;

public class ExitExample {

	public static void main(String[] args) {
		for(int i = 0; i< 10; i++) {
			if(i ==5) {
				System.exit(0);	//조건문, 반복문 종료 아닌 프로그램 종료
				//break;	//반복문 종료
			}
		}
		//프로그램 종료 출력
		System.out.println("마무리 코드");
	}
}