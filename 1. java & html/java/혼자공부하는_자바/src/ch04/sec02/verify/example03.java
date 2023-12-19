package ch04.sec02.verify;

public class example03 {

	public static void main(String[] args) {
		int m;
		int n;
		boolean on = true;
		while (on) {
			m = (int) (Math.random() * 6 + 1);
			n = (int) (Math.random() * 6 + 1);
			System.out.printf("(눈1, 눈2) : (%d, %d)\n", m, n);
			if (m + n == 5) {
				on = !on;
			} else {}
		}

	}

}
