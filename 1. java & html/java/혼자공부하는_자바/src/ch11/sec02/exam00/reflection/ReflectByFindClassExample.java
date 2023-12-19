package ch11.sec02.exam00.reflection;

import ch07.sec00.exam00.Child;

public class ReflectByFindClassExample {

	public static void main(String[] args) {
		//1.클래스찾기
		Class findClass = Child.class;
		System.out.println("Class name : " + findClass.getName());
		
		//	1.1 클래스이름으로 찾기
		//		클래스 이름은 정확하게 패키지이름을 포함
		String ClassName = "ch11.sec02.exam00.Parent";
		//ClassName = "Child";
		//클래스파일의 이름을 모를 때 클래스를 가져와라
		//Class.forName("이름") : 지정된 "이름"의 클래스파일을 찾아 가져와 
		try {
			Class findClass2 = Class.forName(ClassName);
			System.out.println("클래스 이름 : " + findClass2.getName());
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}