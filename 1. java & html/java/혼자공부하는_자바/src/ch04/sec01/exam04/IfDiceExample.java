package ch04.sec01.exam04;

public class IfDiceExample {
	public static void main(String[] args) {
		

		int num = (int) (Math.random() * 6) + 1;
		String msg = ("번이 나왔습니다.");
		if (num == 1) {
			msg = num + msg;
		} else if (num == 2) {
			msg = num + msg;
		} else if (num == 3) {
			msg = num + msg;
		} else if (num == 4) {
			msg = num + msg;
		} else if (num == 5) {
			msg = num + msg;
		} else if (num == 6) {
			msg = num + msg;
		} else {
			msg = ("번호가 잘못되었습니다.");
		}
		
		
//		if( 1 <= num && num <= 6) {
//			msg = num + msg;
//		} else {
//			msg = ("번호가 잘못되었습니다.");
//		}

		System.out.println(msg);
	}
}
