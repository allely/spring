package ch06.sec00.settergetter;

public class SafeArrayExample {

	public static void main(String args[]) {
		int[] array = new int[] {0, 1, 2};
		
		for (int i = 0; i <= array.length; i++) {
			System.out.println("[" + i + "] = " + array[i]);
		}
		System.out.println("프로그램 END");
	}
}