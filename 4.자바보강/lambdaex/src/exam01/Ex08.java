package exam01;

import java.util.function.Function;

public class Ex08 {
    public static void main(String[] args) {
        // 함수 결합
        Function<String, Integer> func1 = s -> s.length();

        Function<Integer, Integer> func2 = x -> x * x * x;

        Function<String, Integer> func3 = func1.andThen(func2);     // func1의 결과를 func2에 넣은 결과값 반환
        int num = func3.apply("ABC");
        System.out.println(num);

        // 항등 함수
        Function<Integer, Integer> func4 = x -> x;
        Function<Integer, Integer> func5 = Function.identity();     // 위와 동일 동작( 입력값 = 반환값)
    }
}
