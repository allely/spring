package ch06.sec00.exam04;

public class MathApp {
	public static void main(String[] args) {
		
		//Math객체를 생성하고 작업
		//익숙해지기 위해 Math Object mathObj객체 선언
		Math mathObj = new Math();
		
		//덧셈 mathobj의 메소드 실행 결과
		int resultAdd = mathObj.add(2, 3);
		System.out.println("2와 3의 합은 : " +resultAdd);
		
		//뺄셈 mathobj의 메소드 실행 결과
		int resultSub = mathObj.sub(100, 50);
		System.out.println("100과 50의 차는 : " +resultSub);
		
		//곱셈 mathobj의 메소드 실행 결과
		int resultMul = mathObj.mul(10, 20);
		System.out.println("10과 20의 곱은 : " +resultMul);
		
		//나눗셈 mathobj의 메소드 실행 결과
		int resultDiv = mathObj.div(100, 50);
		System.out.println("100을  50으로 나누면 : " + resultDiv);
		
		//나머지 구하기 mathobj의 메소드 실행 결과
		int resultMod = mathObj.mod(100, 3);
		System.out.println("100 / 3 의 나머지는 : " + resultMod);
	}
}
