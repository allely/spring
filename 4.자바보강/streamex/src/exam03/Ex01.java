package exam03;

import java.util.stream.IntStream;

public class Ex01 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 10)    // 1부터 10개
                .skip(5)        // 5개를 건너뛴다.
                .forEach(System.out::println);

        IntStream.rangeClosed(1, 10)    // 1부터 10개
                .limit(7)
                .forEach(System.out::println);
    }
}