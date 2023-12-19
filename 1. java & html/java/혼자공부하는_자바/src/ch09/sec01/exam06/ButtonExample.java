package ch09.sec01.exam06;

public class ButtonExample {

	public static void main(String[] args) {
		Button button = new Button();
		
		//실제 버튼을 누르면 실행할 이벤트핸들러 등록
		//	버튼이 눌리면 자동으로 호출할 함수 등록
		button.setOnClickListener(new CallListener());
		//실제 버튼 동작(touch)
		button.touch();
		
		button.setOnClickListener(new MessageListener());
		button.touch();
	}
}