package ch07.sec03.exam02;

public class AnimalExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("----------");
		
		
		Animal animal = null;
	
		//dog객체를 만들어라 new Dog
		//만든 객체를 초기화한다. Dog()
		//그 결과 힙에 만들어진 dog객체를 animal변수가 참조한다.(가리킨다)
		//그래서 dog객체가 아니라 Animal객체를 가리키므로 업캐스팅(upcasting)
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		System.out.println("----------");
		//
	}
}
