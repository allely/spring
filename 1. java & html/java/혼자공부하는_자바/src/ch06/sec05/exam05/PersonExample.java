package ch06.sec05.exam05;

public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "황진이");
		
		System.out.println("국가 : " + p1.nation);
		System.out.println("ssn : " + p1.ssn);
		System.out.println("name : " + p1.name);
		System.out.println();
		Person p2 = new Person("USA", "Jane", "123456-1234567");
		
		System.out.println("국가 : " + p2.nation);
		System.out.println("ssn : " + p2.ssn);
		System.out.println("name : " + p2.name);
		
		//////////////////////////////////////
		
//		p2.nation = "england";		//이미 초기화되어 있기 때문에 오류
	}
}