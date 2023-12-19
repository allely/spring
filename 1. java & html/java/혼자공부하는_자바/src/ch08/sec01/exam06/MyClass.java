package ch08.sec01.exam06;

import ch08.sec01.exam02.Audio;
import ch08.sec01.exam02.RemoteControl;
import ch08.sec01.exam02.Television;

public class MyClass {

	//필드
	RemoteControl rc = new Television();
	
	//생성자
	MyClass(){
		
	}
	MyClass(RemoteControl rc) {
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	
	//메소드
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(7);
	}
	
	//매개변수와 인수의 관계
	//매개변수는 함수를 정의할 때 사용하는 변수가 여기에 온다 라고 
	//  말해주는 형식 위치홀더로 볼 수 있다.
	//인수는 실제 함수를 호출할 때 넘어가는 데이터로
	//  매개변수 자리에 대입된다.
	//RemoteControl rc = new Television() 
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
	}
}
