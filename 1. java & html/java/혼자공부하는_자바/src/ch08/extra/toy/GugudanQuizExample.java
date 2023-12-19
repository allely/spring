package ch08.extra.toy;

public class GugudanQuizExample {

	public static void main(String[] args) {
		//여기에 문제 출제 객체가 생성
		//추상클래스 Quiz는 직접 객체 생성을 할 수 없음(중요)
		//하지만 Quiz 상속받은 실현클래스의 객체를 가리킬 수 있다.
		//업캐스팅
		Quiz quiz = new GugudanQuiz();
		
		//다운캐스팅 : 부모가 자식을 가리킬 때 이 참조를
		//	다시 자식을 가리키도록 만들 수 있다.
		//	이런 경우 자식객체의 멤버를 다시 참조할 수 있다.
		GugudanQuiz guguQuiz = (GugudanQuiz) quiz;
		
		//문제출제
		System.out.println(quiz.getQuestion());
		
		//적당한 게임요소 추가 기능
		//힌트출력
		System.out.println(quiz.getHint());
		
		//정답 출력
		System.out.println(quiz.getAnswer());
	}
}
