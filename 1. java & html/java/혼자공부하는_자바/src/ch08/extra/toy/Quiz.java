package ch08.extra.toy;

//추상클래스 : 불와전한(준비가 덜되어있는) 클래스
//		객체 생성 불가 클래스. new 클래스명 쓸 수 없다.
public abstract class Quiz implements HintHelper{
	//필드
	//퀴즈에 필요한 문제, 해답
	String question;	//문제 저장 필드
	String answer;		//정답 저장 필드

	//생성자
	
	//메소드
	//문제를 출제하는 메소드
	///문제 출제 알고리즘에 따라서 출제내용이 바뀔 수 있으므로
	///	 추상메소드로 만든다
	///출제한 질문과 정답은 별도 필드변수에 저장되므로 
	///  리턴값 void
	abstract void createQuestion();	
	
	//문제를 리턴하는 메소드
	String getQuestion() {
		return this.question;
	}
	
	//정답을 리턴하는 메소드
	String getAnswer() {
		return this.answer;
	}
}
