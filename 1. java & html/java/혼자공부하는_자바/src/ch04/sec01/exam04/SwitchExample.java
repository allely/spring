package ch04.sec01.exam04;

public class SwitchExample {
	public static void main(String[] args) {
		int num = (int) (Math.random() * 6) + 1;
		String msg = ("번이 나왔습니다.");
		switch(num) {
		case 1:
			msg = num + msg;
			break;
		case 2:
			msg = num + msg;
			break;
		case 3:
			msg = num + msg;
			break;
		case 4:
			msg = num + msg;
			break;
		case 5:
			msg = num + msg;
			break;
		case 6:
			msg = num + msg;
			break;
		default:
			msg = ("주사위 눈금이 잘못되었습니다.");
			break;
		}
		System.out.println(msg);
	}
}
