package proxyex;

public class Ex01 {
    public static void main(String[] args) {
        long stime = System.nanoTime();     // 공통 기능

        // 핵심 기능
        ImplCalculator cal1 = new ImplCalculator(); // 반복문
        long result1 = cal1.factorial(10L);
        System.out.printf("cal1 : %d%n", result1);

        long etime = System.nanoTime();     // 공통 기능
        System.out.printf("반복문으로 걸린 시간 : %d%n", etime - stime);

        stime = System.nanoTime();          // 공통 기능

        // 핵심 기능
        RecCalculator cal2 = new RecCalculator();   // 재귀 : 스택이 쌓여서 성능에 좋지 않다.
        long result2 = cal2.factorial(10L);
        System.out.printf("cal2 : %d%n", result2);

        etime = System.nanoTime();          //공통 기능
        System.out.printf("재귀문으로 걸린 시간 : %d%n", etime - stime);
    }   // 왜 재귀문이 더 짧지?
}       // 반복되는 코드를 프록시로 묶어서 처리하려고 한다. -> Ex02