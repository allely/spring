package proxyex;

public class Ex02 {
    public static void main(String[] args) {
        // 데코레이션 패턴. 추가적인 기능을 더한다.
        // 기능을 대신 수행하기 때문에 프록시라고 부른다.
        ProxyCalculator cal1 = new ProxyCalculator(new ImplCalculator());
        long result1 = cal1.factorial(10L);
        System.out.printf("cal1 : %d%n", result1);

        ProxyCalculator cal2 = new ProxyCalculator(new RecCalculator());
        long result2 = cal2.factorial(10L);
        System.out.printf("cal2 : %d%n", result2);
    }
}