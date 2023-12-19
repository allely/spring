package ch07.sec01.exam04;

public class SupersonicAirplane extends Airplane{
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {						//초음속모드로 설정되었다면
			System.out.println("초음속비행합니다.");	//초음속모드로 비행
		} else {			//일반 비행 모드라면
			super.fly();	//부모클래스의 fly()메소드를 호출
		}
	}
}