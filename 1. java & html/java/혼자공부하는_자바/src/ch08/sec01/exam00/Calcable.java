package ch08.sec01.exam00;

public interface Calcable {
	//덧셈을 할 수 있는 메소드 선언(추상 메소드)
	int add(int x, int y);
	
	//반드시 구현
	//고객이 프로그램에 다음의 사항은 반드시 지켜달라고 요청
	//  그럼 반드시 구현했는지를 어떻게 강제할 수 있을까?
	//  예) int add(int x, int y)
	//  	int sub(int x, int y)
	//	  위 두 메소드를 구현했는지 어떻게 보장할 수 있을까? 의 해답
	
	//이중상속
	//안정성
	//필수메소드.
	
	//메소드는 인터페이스
	//상수는 static final 붙여서 인터페이스
	//enum은 ?
}
