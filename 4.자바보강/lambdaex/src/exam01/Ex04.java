package exam01;

import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class Ex04 {
    public static void main(String[] args) {
//        Function<Integer, Integer> func = x -> x * x;
//        UnaryOperator<Integer> func = x -> x * x;
//        int result = func.apply(100);
        IntUnaryOperator func = x-> x * x;  // 기본 자료형으로 연산하여 성능 좋음
        int result = func.applyAsInt(100);
        System.out.println(result);
    }
}
