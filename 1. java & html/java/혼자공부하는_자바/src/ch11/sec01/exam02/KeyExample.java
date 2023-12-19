package ch11.sec01.exam02;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		//Key객체를 식별키로 사용해서
		//	데이터를 저장하는 HashMap(테이블로 생각) 객체 생성
		//HashMap<키 데이터형식, 값 데이터형식> 형식으로 객체를 생성,
		//	엑셀의 워크시트나 디비의 테이블 컬럼구조를 생각하면 된다.
		//	사전이라고 부른다.
		//데이터타입<매개변수형식> 참조변수 = new 데이터타입<매개변수형식>();
		//	데이터타입 : 컬렉션형식
		//	<매개변수형식> : 실제 데이터타입에서 사용하는 데이터 구조
		//	new 데이터타입<매개변수형식> : 메모리에 새로운 방을 만들어라
		//	new 데이터타입<매개변수형식>() : 생성자
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		//식별키 만들기
		Key newKey = new Key(1);
		
		//해시맵에서 데이터 추가
		//hashMap.put(키값, 대응값);
		//해시맵에서 데이터 읽기
		//HashMap.get(키값)
		hashMap.put(newKey, "황진이");
		
		//식별키 변수(=newKey)로 데이터 읽어오기
		String value = hashMap.get(newKey);
		System.out.println("key : " + newKey + ", value = " + value);
		
		//임시 객체를 사용해서 임시로 메모리에 방을 만들고 힙에 접근
		
		//저장시의 new Key(2)와 읽어올 때의 new key(2)는 다르다.
		// 매번 새로운 메모리 ==> 저장된 값이 없어 null값.
		
		//@Override	hashCode()  후 정상동작. <= ??
		
		hashMap.put(new Key(2), "가을");	//저장
		//저장된 데이터 읽어오기
		String value2 = hashMap.get(new Key(2));
		System.out.println();
		System.out.println("key2 : " + new Key(2) + ", value2 = " + value2);
	}
}