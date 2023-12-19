package ch09.sec01.exam05;

public class Main {
	public static void main(String[] args) {
		Outter outter = new Outter();
		//내부클래스 형식은 인스턴트 멤버 클래스
		Outter.Nested nested = outter.new Nested();
		nested.print();
	}
}
