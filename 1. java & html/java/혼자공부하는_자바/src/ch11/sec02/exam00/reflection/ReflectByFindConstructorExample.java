package ch11.sec02.exam00.reflection;

import java.lang.reflect.Constructor;

public class ReflectByFindConstructorExample {

	public static void main(String[] args) throws Exception{
		Class class1 = Class.forName("ch11.sec02.exam00.Child");
		//1. 자손객체 생성자찾기
		Constructor constructor = class1.getDeclaredConstructor();
		System.out.println("생성자 이름 : " + constructor.getName());
		
		//2. 생성자 재정의된(매개변수를 가진) 생성자 찾기
		Constructor constructor2 = 
				class1.getDeclaredConstructor(String.class);
		System.out.println("매개변수를 가진 생성자 :" 
					+ constructor2.getName() );
		
		//3. 모든 생성자를 다 가져오는 방법
		Constructor[] constructor3 = 
				class1.getDeclaredConstructors();
		//	모든 생성자 정보를 화면에 출력
		//for each
		for(Constructor con : constructor3) {
			System.out.println("자손 생성자 : " + con);
		}
		
		//4. public 생성자만 가져오는 방법
		Constructor[] constructor4 = 
				class1.getConstructors();	//public생성자만 가져옴
		//	public 생성자 정보를 화면에 출력
		for(Constructor con : constructor4) {
			System.out.println("public 자손 생성자 : " + con);
		}
	}
}