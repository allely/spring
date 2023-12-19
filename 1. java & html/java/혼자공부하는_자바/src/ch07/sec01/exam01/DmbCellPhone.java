package ch07.sec01.exam01;

public class DmbCellPhone extends CellPhone {
	//필드
	//tv기능을 의미하는 channel변수 선언
	int channel;
	
	DmbCellPhone(String model, String color, int channel){
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	//DmbCellPhone클래스에 필요한 메소드 추가
	//dmbTv를 켜다 = turnOnDmb()
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	//dmb채널을 변경한다 = changeChannelDmb(int channel)
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}
	//dmbTv를 끄다= turnOffDmb()
	void turnOffDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 멈춥니다.");
	}
}
