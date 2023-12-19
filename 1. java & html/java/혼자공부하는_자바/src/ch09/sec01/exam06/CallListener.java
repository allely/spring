package ch09.sec01.exam06;

//버튼 클래스의 OnClickListener 구현 클래스
public class CallListener implements Button.OnClickListener{

	@Override
	public void onClick() {
		System.out.println("전화를 겁니다.");
	}
}