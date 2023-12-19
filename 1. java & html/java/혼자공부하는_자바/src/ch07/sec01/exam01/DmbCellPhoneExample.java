package ch07.sec01.exam01;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		//DmbCellPhone 객체 생성
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "녹색", 10);
		
//		//필드 초기화
//		//부모클래스로부터 상속받은 필드를 사용할 수 있다.
//		dmbCellPhone.model="자바폰";
//		dmbCellPhone.color="보라색";
//	
		
		//필드내용 출력
		System.out.println("모델 : " + dmbCellPhone.model);
		System.out.println("색상 : " + dmbCellPhone.color);
		System.out.println("채널 : " + dmbCellPhone.channel);
		
		//dmbCellPhone을 작동시킵니다.
		String msg = """
				현재 DmbCellPhone클래스는
				cellPhone클래스로부터 상속(extends)받았으나
				아무것도 추가한 것이 없습니다.
				""";
		System.out.println(msg);
		
		//전원을 켤 수 있을까요?
		dmbCellPhone.powerOn();
		//전화벨소리가 들릴 수 있을까요?
		dmbCellPhone.bell();
		//"여보세요"라는 메세지를 보낼 수 있을까요?
		dmbCellPhone.sendVoice("여보세요.");
		//"안녕하세요"라는 메세지를 받을 수 있을까요?
		dmbCellPhone.receiveVoice("안녕하세요! 저는 홍길동입니다.");
		//
		dmbCellPhone.sendVoice("아~ 예 반갑습니다.");
		//통화종료?
		dmbCellPhone.hangUp();
		//전원 off?
		dmbCellPhone.powerOff();
		
		//DmbCellPhone 객체 전용메소드 호출
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(7);
		dmbCellPhone.turnOffDmb();
		

	}

}
