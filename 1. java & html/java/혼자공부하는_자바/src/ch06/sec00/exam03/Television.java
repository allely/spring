package ch06.sec00.exam03;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Television {
	//멤버 필드는 웬만하면 private
	private int channel;	//채널 번호
	private int volume;		//음량
	private boolean onOff;	//전원 상태
	
	private String owner;	//소유자
	private String brand;	//제조원
	private int size;		//크기
	
	
	///////////////////////////////
	//속성메소드
//	public int getChannel() {
//		return channel;
//	}
//
//	public void setChannel(int channel) {
//		this.channel = channel;
//	}
//
//	public int getVolume() {
//		return volume;
//	}
//
//	public void setVolume(int volume) {
//		this.volume = volume;
//	}
//
//	public boolean isOnOff() {
//		return onOff;
//	}
//
//	public void setOnOff(boolean onOff) {
//		this.onOff = onOff;
//	}
//
//	public String getOwner() {
//		return owner;
//	}
//
//	public void setOwner(String owner) {
//		this.owner = owner;
//	}
//
//	public String getBrand() {
//		return brand;
//	}
//
//	public void setBrand(String brand) {
//		this.brand = brand;
//	}
//
//	public int getSize() {
//		return size;
//	}
//
//	public void setSize(int size) {
//		this.size = size;
//	}

	
	/////////////////////
	//기능메소드
	//tv정보출력
		public void printTvInfo() {

			System.out.println("tv객체 정보 : " + this);
			System.out.println("-------------------");
			System.out.println("tv channel : " + this.channel);
			System.out.println("tv volume : " + this.volume);
			System.out.println("tv onOff : " + this.onOff);
			System.out.println("tv brand : " + brand);
			System.out.println("tv size : " + size);
			System.out.println("tv owner : " + owner);
			
		}
			
			
//	//channel을 읽어라(read = get)
//	public int getChannel() {
//		return channel;
//	}
//	
//	//channel 변경(change = set)
//	public void setChannel(int channel) {
//		//channel = channel; 로 쓰는게 가능하지만 명확하게 하기 위해
// 		//(필드의) = 매개변수 
//		this.channel = channel;
//	}
	
//	public int getVolume() {
//		return volume;
//	}
//	
//	//channel 변경(change = set)
//	public void setVolume(int volume) {
//		//channel = channel; 로 쓰는게 가능하지만 명확하게 하기 위해
// 		//(필드의) = 매개변수 
//		this.volume = volume;
//	}

}