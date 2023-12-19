package proxyex;

public class ImplCalculator implements Calculator{

    @Override
    public long factorial(long num) {

        // 단순 반복문으로 팩토리얼 연산 처리
        long total = 1L;
        for(long i = 1L; i <= num; i++) {
            total *= i;
        }
        return total;
    }
}
