package ch07.sec02.exam03;

public class HankookTire extends Tire{

	//필드
	
	//생성자
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	//메소드
	//메소드 오버라이딩(메소드 재정의 = 파생메소드)
	@Override
	public boolean roll() {
		++accumulatedRotation;	//누적회전수 1 증가
		
		//정상회전일 경우(타이어가 정상적으로 수명이 감소) 실행 
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " Tire 수명 : " 
						+ (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {//타이어 회전수 > 최대회전수 == 타이어 펑크
			System.out.println("### " + location + " HankookTire 펑크 ###");
			return false;							//타이어이름만 변경
		}
	}
}
