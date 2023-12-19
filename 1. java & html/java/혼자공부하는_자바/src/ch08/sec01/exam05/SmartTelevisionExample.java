package ch08.sec01.exam05;

import ch08.sec01.exam02.RemoteControl;

public class SmartTelevisionExample {

	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		
		RemoteControl rc = tv;
		Searchable searchable = tv;
		
//		searchable. //쓸 수 있는 필드가 없다. 인터페이스이기 떄문에.
		
		rc.turnOn();
		rc.setVolume(7);
	}
}
