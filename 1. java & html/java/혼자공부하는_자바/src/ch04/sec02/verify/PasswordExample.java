package ch04.sec02.verify;
import java.util.Scanner;
public class PasswordExample {

	public static void main(String[] args) {

		/*연습문제 2. 반복문을  이해하고 있을까요.
    	 *키보드로부터 암호를 입력합니다.
      	 *ㄱ) 암호를 비교하여 같으면  "암호 OK!" 출력
    	 *ㄴ)암호가 틀리면 "암호가 틀립니다!. 올바른 암호를 입력해주세요" 출력
    	 *ㄷ) 암호를 5번 틀리면 "암호를 확인해주세요. 관리자에게 확인해 주세요." 출력
            더이상 암호를 입력할 수 없도록 합니다.
		 */
		Scanner scanner = new Scanner(System.in);
		String PW = "tiger";
		int n = 0;
		
		while(n < 5) {
			System.out.print("비밀번호 : ");
			String user_PW = scanner.nextLine();
			System.out.println(PW);
			if(PW.equals(user_PW)) {
				System.out.println("암호 OK!");
				break;
			} else {
				System.out.println("암호가 틀립니다! 올바른 암호를 입력해주세요.");
				if(n >= 4) {
					System.out.println("암호를 5회 틀렸습니다. 관리자에게 확인해 주세요");	
				}
				n++;
			}
		}
	}
}
