package exam02;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);   // 컬렉션에서 기본형은 사용X

        IntSummaryStatistics stat= nums.stream()
                .mapToInt(x -> x)     // 기본자료형으로
                .summaryStatistics();
        long sum = stat.getSum();
        double avg = stat.getAverage();
        long count = stat.getCount();
        int max = stat.getMax();
        int min = stat.getMin();

        System.out.printf("sum=%d, avg=%.2f, count=%d, max=%d, min=%d%n", sum, avg, count, max, min);
    }
}
