//생성자 오버로딩

package ch06.sec03.exam03;

public class CarExample {

	public static void main(String[] args) {
		Car car1 = new Car();	//Car() 호출
		System.out.println("car1.company : " + car1.company);
		System.out.println("car1.model : " + car1.model);
		System.out.println("car1.color : " + car1.color);
		System.out.println("car1.maxSpeed : " + car1.maxSpeed);
		System.out.println("--------------------------------");
		
		Car car2 = new Car("자가용");	//Car() 호출
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println("car2.color : " + car2.color);
		System.out.println("car2.maxSpeed : " + car2.maxSpeed);
		System.out.println("--------------------------------");
		
		Car car3 = new Car("자가용", "빨강");	//Car() 호출
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println("car3.maxSpeed : " + car3.maxSpeed);
		System.out.println("--------------------------------");
		
		Car car4 = new Car("택시", "검정", 200);	//Car() 호출
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
	}
}
