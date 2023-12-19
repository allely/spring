package ch06.sec00.settergetter;

public class SafeArrayExample02 {

	public static void main(String[] args) {
		//테스트할 SafeArray 객체 생성
		SafeArray array = new SafeArray(3);
		
		for(int i = 0; i <= array.length ; i++) {
			array.put(i,  i * 10);
		}
		
		for(int i = 0; i <= array.length ; i++) {
			System.out.println("[" + i + "]  = " + array.get(i) );
		}
	}
}
