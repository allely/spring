package ch07.sec02.exam06;

public class InstanceOfExample{

	public static void main(String[] args) {
		Parent parent1 = new Child();
		method1(parent1);
		method2(parent1);
		
		Parent parent2 = new Parent();
		method1(parent2);
		method2(parent2);		//ClassCaseException 발생
								
		//강제변환하기 전에 instanceof 연산자로 변환시킬 타입의 객체인지 확인해서 
		//오류가 생길 가능성을 막아야 한다.( = method1)
	}

	private static void method1(Parent parent) {
		if (parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1 = Child로 변환 성공");
		} else {
			System.out.println("method1 = Child로 변환되지 않음");
		}

	}
	private static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2 = Child로 변환 성공");
	}
}
