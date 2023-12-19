package ch06.sec03.exam04;

public class Calculator {
	//명령메소드 = 반환값 필요없음
		//전원을 켠다
	void powerOn() {
		System.out.println("계산기의 전원을 켭니다");
	}
		//전원을 끈다
	void powerOff() {
		System.out.println("계산기의 전원을 끕니다");
	}
	
	//기능메소드 = 반환값이 있을 수 있음
		//더하기
	int add(int x, int y) {
		return x+y;
	}
		//빼기
	int sub(int x, int y) {
		return x-y;
	}
		//곱하기(정수형)
	int mul(int x, int y) {
		return x * y;
	}		
		//나누기(정수 몫만 구하는 경우)
	int divide(int x, int y) {
		return x / y;
	}
		//나누기(실수형) => 오버로딩
	double divide(double x, double y) {
		return x / y;
	}
		//나머지
	double mol(double x, double y) {
		return x % y;
	}	
}
