//변수 사용 범위
package ch01.sec02.exam04;

public class VariableScopeExample {

	public static void main(String[] args) {
		int v1 = 15;
		if(v1 > 10) {
			int v2 = v1 - 10;
		}
		int v3 = v1 + v2 + 5;//변수 사용 범위를 넘어면 사용할 수 없다.
	}
}
