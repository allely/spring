package ch02.sec04.exam06;

import java.util.Scanner;

public class UserInfoScannerExample {
	//정보를 입력받아 변수에 저장하고 출력
	public static void main(String[] args) {
		String name;
		String ssnNumber;
		String hp;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("[필수 정보 입력]");
		System.out.print("1. 이름 : ");
		name = scanner.nextLine();
		System.out.print("2. 주민번호 앞 6자리 : ");
		ssnNumber = scanner.nextLine();
		System.out.print("3. 전화번호 : ");
		hp= scanner.nextLine();
		
		System.out.println("[입력한 내용]");
		System.out.println(name);
		System.out.println(ssnNumber);
		System.out.println(hp);
	}
}
