package ch08.sec01.exam05;

import ch08.sec01.exam02.RemoteControl;

public class SmartTelevision implements RemoteControl, Searchable{
	//필드
	private int volume;

	//메소드
	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}

	@Override
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		//볼륨을 변경했으므로 로그 기록
		System.out.println("현재 tv 볼륨 : " + this.volume);
	}
}
