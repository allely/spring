//float과 double 차이
package ch02.sec02.exam07;

public class FloatDoubleExample {
	public static void main(String[] args) {
		
		//float var1 = 3.14;	//컴파일 에러
		float var2 = 3.14f;
		double var3 = 3.14;
		
		//소수점 자리비교
		float var4 = 0.1234567890123456789f;
		double var5 = 0.1234567890123456789;
		
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		System.out.println("var5 : " + var5);
		
		//e
		double var6 = 3e6;
		float var7 = 3e6f;
		double var8 = 2e-3;
		System.out.println("var6 : " + var6);
		System.out.println("var7 : " + var7);
		System.out.println("var8 : " + var8);
	}	
}
