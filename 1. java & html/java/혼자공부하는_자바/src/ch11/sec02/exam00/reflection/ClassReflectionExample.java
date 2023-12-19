package ch11.sec02.exam00.reflection;

public class ClassReflectionExample {

	public static void main(String[] args) throws ClassNotFoundException {
		// 1. 바이트코드(자바 기계어 실행파일) 분석을 위해
		// 클래스(바이트코드 파일) 파일을 읽어오는 방법 1
		Class clazz = Car.class;
		// 방법1로 바이트코드 정보 출력
		System.out.println("### clazz 클래스 정보 얻기 ###");
		System.out.println("clazz 참조클래스의 전체 이름  : " + clazz.getName());
		System.out.println("clazz의 클래스 이름 : " + clazz.getSimpleName());
		System.out.println("clazz의 패키지 이름 : " + clazz.getPackage().getName());
													//clazz.getPackagerName();
		System.out.println();

		// 2. 클래스 파일을 읽어오는 방법 2 (추천, 예외 발생 가능)
		Class clazz2 = Class.forName("ch11.sec02.exam00.Car");
		// 방법2로 바이트코드 정보 출력
		System.out.println("### clazz2 클래스 정보 얻기 ###");
		System.out.println("clazz2 참조클래스의 전체 이름  : " + clazz2.getName());
		System.out.println("clazz2의 클래스 이름 : " + clazz2.getSimpleName());
		System.out.println("clazz2의 패키지 이름 : " + clazz2.getPackage().getName());

		System.out.println();

		// 3. 클래스 파일을 읽어오는 방법 3
		Car car = new Car();
		Class clazz3 = car.getClass();
		// 방법3로 바이트코드 정보 출력
		System.out.println("### clazz3 클래스 정보 얻기 ###");
		System.out.println("clazz3 참조클래스의 전체 이름  : " + clazz3.getName());
		System.out.println("clazz3의 클래스 이름 : " + clazz3.getSimpleName());
		System.out.println("clazz3의 패키지 이름 : " + clazz3.getPackage().getName());
		
	}
}