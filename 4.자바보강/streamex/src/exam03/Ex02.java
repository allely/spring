package exam03;

import java.util.stream.IntStream;

public class Ex02 {
    public static void main(String[] args) {
        int total = IntStream.rangeClosed(1, 100)   // 1 ~ 100
                .filter(x -> x % 2 == 1)    // 필터 ( 홀수만 )
                .sum();     // 합계
        System.out.println(total);
    }
}