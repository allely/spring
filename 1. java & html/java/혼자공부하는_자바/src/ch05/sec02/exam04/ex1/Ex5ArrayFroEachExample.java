package ch05.sec02.exam04.ex1;

public class Ex5ArrayFroEachExample {

	public static void main(String[] args) {
		int[] numbers = new int[] { 10, 20, 30};
		
		///향상된 for ~ each 반복문
		System.out.println("for ~ each 반복문");
		for(int num : numbers) {
			System.out.println(num);
		}
		
		///단순한 for 반복문
		System.out.println("단순/반복형 for반복문");
		for(int i = 0; i <numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
}
