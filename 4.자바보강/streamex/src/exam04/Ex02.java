package exam04;

import java.util.Arrays;

public class Ex02 {     // max
    public static void main(String[] args) {
        int[] nums = { 22, 10, 5, 99, 17 };

//        int max = Arrays.stream(nums)
//                .reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);
        int max = Arrays.stream(nums)
                .reduce(Integer.MIN_VALUE, (a, b)  -> {
                    System.out.printf("a=%d, b=%d%n", a, b);

                    if (a > b) return a;
                    else return b;

                });
        System.out.println(max);
    }
}
