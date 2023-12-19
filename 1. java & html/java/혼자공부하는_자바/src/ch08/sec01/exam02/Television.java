package ch08.sec01.exam02;

public class Television implements RemoteControl{
	//필드
	private int volume;
	
	@Override
	public void turnOn() {
	System.out.println("TV를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume >= RemoteControl.MAX_VOLUME) {
			this.volume = MAX_VOLUME;
		}
		else if(volume <= RemoteControl.MIN_VOLUME) {
			this.volume = volume;
		}
		
		//볼륨값 출력
		System.out.println("볼륨 : " + this.volume);
	}
}
