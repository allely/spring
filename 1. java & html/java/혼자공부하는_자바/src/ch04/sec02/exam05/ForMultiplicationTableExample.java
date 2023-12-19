package ch04.sec02.exam05;

public class ForMultiplicationTableExample {
	public static void main(String args[]) {
		for(int i=2; i<=9; i++) {
			System.out.println("====" + i + "단" + "====");
			for(int j=1; j<=9; j++) {
				System.out.println( i + " * " + j + " = " + (i * j));
			}
			System.out.println();
			
		/*for(int i=2; i<=9; i++) {
			System.out.println("====" + i + "단" + "====");
			for(int j=1; j<=9; j++) {
				int result = i * j;   //반복문 안에 변수 선언을 해도 되네?
				System.out.println( i + " * " + j + " = " + (i * j));
			}
			System.out.println();
		*/
		}
	}
}
