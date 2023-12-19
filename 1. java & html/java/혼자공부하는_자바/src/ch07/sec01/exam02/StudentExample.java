package ch07.sec01.exam02;

public class StudentExample {

	public static void main(String[] args) {
		Student student = new Student("홍길동", "123456-234567", 1);
		
		//홍길동 학생의 정보 출력
		//Student 클래스는 실제로 name, ssn을 직접 가지고 있지 않고
		//	부모 클래스를 통해서 상속받아 참조하고 있으므로
		//	어떻게 결과가 나올지?
		System.out.println("name : " + student.name);
		System.out.println("ssn : " + student.ssn);
		System.out.println("studentNo : " + student.studentNo);
	}

}
