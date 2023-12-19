package ch06.sec03.exam04;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator calc = new Calculator();

		//전원 켠다
		calc.powerOn();
		
		//덧셈
		int returnValue = calc.add(100, 200);
		System.out.println("100 + 200 = " + returnValue);
		
		//나눗셈
		int returnValue2 = calc.divide(100, 3);
		System.out.println("100 / 3 = " + returnValue2);
		
		//나눗셈
		double returnValue3 = calc.divide((double)100, 3);
		System.out.println("100 / 3 = " + returnValue3);
				
		//전원 끈다
		calc.powerOff();
	}
}
