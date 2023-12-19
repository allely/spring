package ch11.sec01.exam05;

public class SmartPhoneExample {
	public static void main(String[] args) {
		
	SmartPhone myPhone = new SmartPhone("구글", "안드로이드");
	
	String strObj = myPhone.toString();
	System.out.println(strObj);
	
	System.out.println(myPhone);
	}	
}
//print로 객체를 출력하면 toString() 메소드가 호출되어
//	클래스 이름과 해시코드로 구성된 문자열 반환
//여기에서는 함수 toString() 메소드가 @Override로 재정의되어
//	필드값들로 구성된 문자열을 반환하도록 함.