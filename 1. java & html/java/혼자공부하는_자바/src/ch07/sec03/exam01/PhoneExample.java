package exam01;

public class PhoneExample {

	public static void main(String[] args) {
//		Phone phone = new Phone)();
		
		SmartPhone myPhone = new SmartPhone("나");
		
		//Phone클래스의 기능
		myPhone.turnOn();
		
		//SmartPhone클래스의 기능
		myPhone.internetSearch();
		
		//Phone클래스의 기능
		myPhone.turnOff();
	}

}
