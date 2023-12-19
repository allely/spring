package ch03.sec02.exam11;

public class ConditionalOperationExample {
	public static void main(String[] args) {
		//점수 판정 예제
		int score = 85;
		
		//if(score>90) { char grade = 'A'} 
		//else if(score>80) { char grade = 'B'} 
		//else {char grade = 'C'}
		char grade = (score > 90) ? 'A' : ( (score > 80) ? 'B' : 'C');
		System.out.println(score + "점은 " + grade + "등급입니다.");
	}
}
