package ch08.extra.toy;

import java.util.Random;
import java.util.Scanner;

public class FourBasicCalcQuiz extends Quiz{
	//필드
	final int CALC_ADD = 0;
	final int CALC_SUBSTRACT = 1;
	final int CALC_MULTIPY = 2;
	final int CALC_DIVIDE = 3;
	final int CALC_MAX_NUMBER = 100;
	
	//생성자
	public FourBasicCalcQuiz() {
		createQuestion();
	}
	
	public String getHint() {	
		return  "";
	}

	@Override
	void createQuestion() {
		Random rnd = new Random();
		Scanner scanner = new Scanner(System.in);
		int choice = rnd.nextInt(4);
		int num1 = rnd.nextInt(CALC_MAX_NUMBER);
		int num2 = rnd.nextInt(CALC_MAX_NUMBER);
		int result;
		switch (choice) {
		case CALC_ADD : // 덧셈
			//두 수의 난수를 발생시킨다.
			
			result = num1 + num2;
			this.question = """
					$num1 + $num2 = $result 연산의 결과는?
					"""
					.replace("$num1", "" + num1)
					.replace("$num2", "" + num2)
					.replace("$result", "[ooo]");
			
			this.answer = """
					정답 : $num1 + $num2 = $result 입니다
					"""
					.replace("$num1", "" + num1)
					.replace("$num2", "" + num2)
					.replace("$result", "" + result);
			
//			this.hint = """
//					두 정수의 덧셈에 대한 문제입니다.
//					""";
			break;	//덧셈 정지
		
		case CALC_SUBSTRACT : 	// 뺄셈
			
			result = num1 - num2;
			this.question = """
					$num1 - $num2 = $result 연산의 결과는?
					"""
					.replace("$num1", "" + num1)
					.replace("$num2", "" + num2)
					.replace("$result", "[ooo]");
			
			this.answer = """
					정답 : $num1 - $num2 = $result 입니다
					"""
					.replace("$num1", "" + num1)
					.replace("$num2", "" + num2)
					.replace("$result", "" + result);
			
//			this.hint = """
//					두 정수의 뺼셈에 대한 문제입니다.
//					""";
			break;	//뺄셈 정지
		
		case CALC_MULTIPY :		//곱셈
			
			result = num1 * num2;
			this.question = """
					$num1 * $num2 = $result 연산의 결과는?
					"""
					.replace("$num1", "" + num1)
					.replace("$num2", "" + num2)
					.replace("$result", "[ooo]");
			
			this.answer = """
					정답 : $num1 * $num2 = $result 입니다
					"""
					.replace("$num1", "" + num1)
					.replace("$num2", "" + num2)
					.replace("$result", "" + result);
			
//			this.hint = """
//					두 정수의 곱셈에 대한 문제입니다.
//					""";
			break;	//곱셈 정지
		case CALC_DIVIDE :		//나눗셈
			
			result = num1 / num2;
			this.question = """
					$num1 / $num2 = $result 연산의 결과는?
					"""
					.replace("$num1", "" + num1)
					.replace("$num2", "" + num2)
					.replace("$result", "[ooo]");
			
			this.answer = """
					정답 : $num1 / $num2 = $result 입니다
					"""
					.replace("$num1", "" + num1)
					.replace("$num2", "" + num2)
					.replace("$result", "" + result);
			
//			this.hint = """
//					두 정수의 나눗셈에 대한 문제입니다.
//					""";	
			break;	//나눗셈 정지
		}
	}
}
