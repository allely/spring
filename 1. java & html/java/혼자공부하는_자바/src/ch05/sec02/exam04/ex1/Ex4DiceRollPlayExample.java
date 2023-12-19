package ch05.sec02.exam04.ex1;

public class Ex4DiceRollPlayExample {

	public static void main(String[] args) {
		//1. 주사위의 눈금의 수를 기호상수로 정의
		//  나중에 눈금의 수가 변하더라도 프로그램 고칠 필요 없다
		//2. 주사위를 던져서 나온 눈의 횟수를 측정할 변수 diceCount 선언
		//  이 변수는 1의 눈, 2의 눈, ..., 6의 눈 등에도 공통되게 작용
		//  이런 경우 배열이 적격
	
		//인덱스 7개 사용하여 0에 총 던진 횟수 저장
		final int diceLength = 7;  
		int[] diceCount = new int[diceLength];
		
		for(int i = 0; i< 10000; i++) {
			diceCount[(int)(Math.random() * diceLength-1) + 1]++;	
			diceCount[0]++;		//주사위 던진 횟수를 인덱스 0에 저장
		}
		System.out.println("===================");
		System.out.println("면\t\t빈도");
		System.out.println("===================");
		
		for(int i=0; i<diceCount.length; i++) {
			if(i == 0) {
				System.out.println("총 던진 횟수\t" +  diceCount[i]);
			}else {
				System.out.println(i +"\t\t" +  diceCount[i]);
			}
		}
	}
}
