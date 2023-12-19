package exam03;

import java.util.Arrays;

public class Ex06 {
    public static void main(String[] args) {
        String[] strs = { "aa", "aaa", "bbb", "ccc"};

        boolean result = Arrays.stream(strs)
                .anyMatch(s -> s.length() >= 3);
        System.out.println(result);
    }
}
