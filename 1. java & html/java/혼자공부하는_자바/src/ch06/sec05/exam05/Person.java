package ch06.sec05.exam05;

public class Person {
	final String nation;// = "korea";
	final String ssn;				//fianl : 초기화 후 수정못함
	String name;					//선언일 뿐
	
	public Person(String ssn, String name) {
		this.nation = "korea";
		this.ssn = ssn;
		this.name = name;
	}
	
	public Person(String nation, String ssn, String name) {
		this.nation = nation;
		this.ssn = ssn;
		this.name = name;
	}
}