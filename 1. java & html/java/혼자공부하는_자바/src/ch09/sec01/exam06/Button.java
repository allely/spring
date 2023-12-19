package ch09.sec01.exam06;

public class Button {
	//인페이스 정의
	//여기서는 두 가지 의미로 사용
	//	자바의 다운속도를 정의하는 메소드 사용
	//	자바의 다중상속을 정의하는 메소드 선언
	//버튼 클래스의 이벤트가 발생할 때
	//	자동호출(롤백)되는 이벤트핸들러의 연결코드
	OnClickListener listener;	//인터페이스 타입 필드
	
	//매개변수 등록
	//매개변수를 이용한 다형성
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	//실제 하드웨어로 구현되나
	//지금은 시뮬레이션(가정) 화면이 있다고 보고 화면을 누르면
	void touch() {
		listener.onClick();		//실제 위 인터페이스를 구현할 객체의
								//	 OnClick()메소드 호출
	}
	
	static interface OnClickListener {
		void onClick();
	}
}
