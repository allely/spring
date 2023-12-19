package ch08.extra.toy;

import java.util.Random;

public class GugudanQuiz extends Quiz{
	//필드
	
	//생성자
	GugudanQuiz() {
		createQuestion();
	}
	@Override
	void createQuestion() {
/*구구단퀴즈 알고리즘
 *1. 난수로 몇 단인가를 생성
 *	조금 더 확장 사용자 입력받아도 된다.
 *2. 출제된 구구단 계산결과에서
 *	사용자에게 보여주지 않을 위치번호생성
 *예) 난수로 3단을 생성, 3열을 안보여주려고 한다.
 *	위치 	:   1|   2|   3|   4|   5|   6|   7|   8|   9|
 *	구구단값: 3*1| 3*2|   0| 3*4| 3*5| 3*6| 3*7| 3*8| 3*9|
 *
 *난수를 발생시킵니다.
 *3. 구구단 계산결과 화면에 출력
 *	화면에 보여줄 계산 결과와
 *	화면에 보여주지 않을 사용자가 입력할 계산 결과
 *	를 합쳐서 문제를 생성하여 문자열을 화면에 출력
 *4. 정답 문자열을 생성
 *
 */
		//Math.random() : 사용하기 편한 대신 세세한 설정하려 할 때 복잡함
		//Random 클래스 : 객체를 생성해야 하고 메소드를 학습해야 하지만 응용성이 좋음
		Random rnd = new Random();
		//2.
		//몇 단인가 난수 생성
		int dan = rnd.nextInt(10);	// 0 <= dan < 10 인 정수
		//출제된 문제에서 감춰질 위치번호
		int qId = rnd.nextInt(10);
		final int MAX_QUESTION_ID = 9;	//구구단의 마지막 열
		//3.
		//화면에 출력할 문자열
		//문제와 정답 두 개가 있다
		this.question = "";		//현재 문제 출제 안되었음
		this.answer = "";		//현재 정답 생성 안되었음
		
		for(int i = 3; i < MAX_QUESTION_ID; i++) {
			//이쪽은 동시에 일어나야 하고 선택을 하므로'
			//if ~ else 구문 사용
			//구구단 계산 결과를 보여 줄 때
			if(i == qId-1) {	//우리가 생각하는 위치와 컴퓨터의 위치는
							// 1차이가 있으므로
				this.question += "[o]";		//빈칸출력
			} else {//	보여주지 않을 때
				this.question += "[" +(dan * (i - 1)) + "]";
				//그 열의 구구단 값을 출력
				//for 루프가 0부터 인덱스를 세고 있으므로
				//1열부터 계산하려면 인덱스 + 1
			}
		}
		//문제안내
		this.question += "\n[O]빈 칸에 들어갈 숫자는?";
		//정답출력?
		//this.answer = ? ;
		
	}
	@Override
	public String getHint() {	//힌트추가
		return  "우선 구구단이 몇 단인지 생각해 보세요.";
	}
}
