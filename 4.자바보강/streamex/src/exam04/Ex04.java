package exam04;

import java.util.Arrays;
import java.util.OptionalInt;

public class Ex04 {     // sum
    public static void main(String[] args) {
        int[] nums = {22, 10, 5, 99, 17};

        OptionalInt opt = Arrays.stream(nums)
                .reduce((acc, num) -> {
                        // acc에 첫번째 값이 들어간다.
                    System.out.printf("acc=%d, num=%d%n", acc, num);

                    acc += num;

                    return acc;
                });
        int total = opt.getAsInt();
        System.out.println(total);
    }
}
