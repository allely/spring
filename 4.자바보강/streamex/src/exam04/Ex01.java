package exam04;

import java.util.Arrays;

public class Ex01 {     // sum
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int total = Arrays.stream(nums)
                .reduce(0, (acc, num) -> {
                        // 첫번째 acc에 0, num에 nums의 첫번째 값이 들어간다.
                    System.out.printf("acc=%d, num=%d%n", acc, num);

                    acc += num;

                    return acc;
        });
        System.out.println(total);
    }
}
