package ch08.sec01.exam00;

//인터페이스 상속을 받으면 인터페이스에 있는 내용을 반드시 구현
public class CalcWithCalcable implements Calcable{


	//인터페이스를 구현한 것만
	@Override
	public int add(int x, int y) {
		int result = x + y;
		return result;
	}
}
