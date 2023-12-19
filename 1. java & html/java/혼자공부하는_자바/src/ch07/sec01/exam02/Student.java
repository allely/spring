package ch07.sec01.exam02;

public class Student extends People{
	//Student 추가 필드
	public int studentNo;	//학생번호
	
	//부모에게서 받은 생성자
	public Student(String name, String ssn) {
		super(name, ssn);	
	}
	
	//추가 필드를 포함한 생성자
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
	}
}
