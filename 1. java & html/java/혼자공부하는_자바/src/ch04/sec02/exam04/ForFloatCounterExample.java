package ch04.sec02.exam04;

public class ForFloatCounterExample {
	public static void main(String[] args) {
		//float 이용한 반복문
		//실수는 반복문의 변수로 쓰지 않는 것이 좋다.
		for(float x=0.1F; x<=1.0F; x+=0.1F) {
			System.out.println(x);
		}
		for(double x=0.1; x<=1.0; x+=0.1) {
			System.out.println(x);
		}
	}
}
