package ch07.sec02.exam03;

public class Tire {
	//필드
	public int maxRotation;
	public int accumulatedRotation;
	public String location;
	
	//생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	//메소드
	//타이어의 교체시기를 알려주는 역할
	public boolean roll() {
		++accumulatedRotation;	//누적회전수 1 증가
		
		//정상회전일 경우(타이어가 정상적으로 수명이 감소) 실행 
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " Tire 수명 : " 
						+ (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {//타이어 회전수 > 최대회전수 == 타이어 펑크
			System.out.println("*** " + location + " Tire 펑크 ***");
			return false;							
		}
	}
}
