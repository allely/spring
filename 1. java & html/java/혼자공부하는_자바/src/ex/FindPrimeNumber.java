package ex;

public class FindPrimeNumber {
	public static void main(String[] args) {
		
		for(int i = 2; i < 51; i++) {
			
			int count = 0;
			
			for(int j = 2; j < i-1; j++) {
				if(i % j == 0) {
					count += 1;
				}
			}
			
			if(count == 0) {
				System.out.println(i);
			
			}
		}
	}
}