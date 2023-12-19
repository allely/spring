package ch07.sec01.exam03;

public class ComputerExample {

	public static void main(String[] args) {
		int r = 10;
		Calculator calculator = new Calculator();
		System.out.println("Calculator로 계산한 원의 면적 : " + calculator.areaCircle(r));
		System.out.println();
		Computer computer = new Computer();
		System.out.println("Computer로 계산한 원의 면적 : " + computer.areaCircle(r));
	}
}
