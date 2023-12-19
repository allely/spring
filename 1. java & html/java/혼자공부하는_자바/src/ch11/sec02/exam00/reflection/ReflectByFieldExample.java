package ch11.sec02.exam00.reflection;

//reflect 패키지의 모든 클래스를 가져온다
//	import java.lang.reflect.*;
import java.lang.reflect.Field;

public class ReflectByFieldExample {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException {
		//분석할 클래스 가져오기
		Class class1 = Class.forName("ch11.sec02.exam00.Child");
		
		//불러온 바이트코드로부터 검색할 대상이 필드
		//리플렉션으로 불러온 Child클래스의 멤버필드
		//	cstr1의 내용 불러오기
		//Class.getDeclaredField("필드명")
		Field field = class1.getDeclaredField("cstr1");
		//cstr1 필드의 시그니처(=선언) 살펴보기
		System.out.println("멤버 필드 cstr1의 형식 가져오기 : " + field);
		
		//2. 모든 필드정보를 가져온다
		//	Class.getDeclaredField()
		Class class2 = Class.forName("ch11.sec02.exam00.Parent");
		Field[] fields2 = class2.getDeclaredFields();
		//fields2배열의 내용을 화면에 출력한다.
		//	배열을 출력할 때는 for ~ each 루프가 최적
		for(Field fieldItem : fields2) {
			System.out.println("Parent클래스의 모든 필드변수 정보 출력 : " + fieldItem);
		}
		
		//3. public 필드만 가져오세요
		//	class.getField()
		Class class3 = Class.forName("ch11.sec02.exam00.Child");
		Field[] fields3 = class3.getFields();
		//fields3의 정보 출력
		for(Field field3 : fields3) {
			System.out.println("Child클래스의 모든 public 필드변수 정보 : " + field3);
		}
	}
}