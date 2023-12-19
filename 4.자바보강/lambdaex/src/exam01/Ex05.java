package exam01;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class Ex05 {
    public static void main(String[] args) {
//        BiFunction<Integer, Integer, Integer> func = (a,b) -> a + b;
                // 같은 자료형 반복해서 쓰기 번거롭다. -> 하나로
//        BinaryOperator<Integer> func = (a,b) -> a + b;
//        int result = func.apply(10, 20);
                // Wrapper클래스 에서 꺼내쓰기 때문에 기본 자료형 연산보다 성능이 떨어진다.
                //      -> 기본자료형으로 사용할 수 있는 인터페이스가 존재한다. Ex06
        IntBinaryOperator func = (a, b) -> a + b;
        int result = func.applyAsInt(10, 20);
        System.out.println(result);
    }
}
