package exam01;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        /* 방법1
        Calculator cal = new Calculator() {
            @Override
            public int square(int num) {
                return num * num;
            }
        };
        int[] nums2 = calc(nums, cal);
         */ // 하나의 기능만 수행하는데 많은 줄을 차지하고 있다고 판단.

        /* //방법2 직접 매개변수에 넣어서 사용
        int[] nums2 = calc(nums, new Calculator() {
            public int square(int num) {
                return num * num;
            }
        });
         */

        // 더 짧게 사용할 수 있게 하나의 식으로 표현하는 방법 -> 람다식
        int[] nums2 = calc(nums, x-> x * x);

        System.out.println(Arrays.toString(nums2));
    }

    public static int[] calc(int[] nums, Calculator cal) {
        int[] nums2 = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            nums2[i] = cal.square(nums[i]); // 단일 기능
        }
        return nums2;
    }
}