package exam05;

import java.util.Arrays;

public class Ex03 {
    public static void main(String[] args) {
        // 다차원배열 비교
        int[][] nums1 = { {10, 20, 30}, {40, 50, 60} };
        int[][] nums2 = { {10, 20, 30}, {40, 50, 60} };

        boolean isSame = Arrays.deepEquals(nums1, nums2);
        System.out.println(isSame);

        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.deepToString(nums1));

    }
}
