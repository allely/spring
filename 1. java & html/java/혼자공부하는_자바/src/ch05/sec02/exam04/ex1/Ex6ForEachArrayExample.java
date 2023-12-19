package ch05.sec02.exam04.ex1;

public class Ex6ForEachArrayExample {
	public static void main(String[] args) {
		//1. 5명의 학생의 이름을 변수(배열)에 저장
		//2. 저장한 학생의 이름을 출력
		//   System.out.println(); 사용
		//3. for ~ each 구문을 사용
		String[] studentName = new String[] 
				{"황진이", "영희", "홍길동", "무지개", "가을"};
		for(String name : studentName) {
			System.out.println(name);
		}
	}
}
