package ch04.sec02.exam10;

public class ContinueExample {

	public static void main(String[] args) {
		for(int i = 1; i<=10; i++) {
			if(i%2 != 0) {      //홀수일 경우 for문(증감,조건)으로
				continue;
			}
			System.out.println(i);	//짝수만 출력
		}
	}
}
