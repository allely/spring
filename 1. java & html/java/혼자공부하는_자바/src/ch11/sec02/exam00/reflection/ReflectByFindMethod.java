package ch11.sec02.exam00.reflection;

import java.lang.reflect.Method;

public class ReflectByFindMethod {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException {
		Class class1 = Class.forName("ch11.sec02.exam00.Child");
		//1. 검색할 대상이 이번에는 메소드
		//	getDeclaredMethod("메소드이름", 메소드의 매개변수객체타입)
		Method method1 = class1.getDeclaredMethod("method4", int.class);
		System.out.println("Child클래스에서 메소드4발견 : " + method1);
		
		//2. 매개변수가 없는 경우
		//	getDeclaredMethod("메소드이름", null)
		Class class2 = Class.forName("ch11.sec02.exam00.Child");
		Method method2 = class2.getDeclaredMethod("method4", null);
		System.out.println("Child클래스에서 메소드4발견 : " + method1);
		
		//3. 매개변수가 2개 이상인 경우
		//	검색할 클래스
		Class class3 = Class.forName("ch11.sec02.exam00.Parent");
		//	매개변수가 2개 이상이면 배열로 전달
		//	method3(int, int)이므로 매개변수 갯수 2개
		Class[] parTypes = new Class[2];
		parTypes[0] = int.class;
		parTypes[1] = int.class;
		Method method3 = class3.getDeclaredMethod("method3", parTypes);
		System.out.println("Parent's method3 : " + method3);
		
		//4. public 메소드만
		Class class4 = Class.forName("ch11.sec02.exam00.Child");
		Method[] publicMethods = class4.getMethods();
		for (Method tempMethod : publicMethods) {
			System.out.println("Child클래스의 public method info : "
					+ tempMethod);
		}
		
		//5. 모든 메소드
		//getDecalredMethods
	}
}