package proxyex;

public class RecCalculator implements Calculator{
    @Override
    public long factorial(long num) {

        // 재귀(Recursive)함수로 팩토리얼 연산 처리
        if (num < 1L) {
            return 1L;
        }
        return num * factorial(num - 1);    //재귀
    }
}
