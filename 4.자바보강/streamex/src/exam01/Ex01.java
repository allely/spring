package exam01;

import java.util.Arrays;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {
        String[] words = { "aaa", "aaa", "bb", "cc", "abcd", "abcd"};

        Arrays.stream(words)
                .distinct()      // 중복제거
                .filter(s -> s.length() >= 3)   // 3자 이상인 것만
                .forEach(System.out::println);  // 출력

        List<String> words2 = Arrays.asList("aaa", "aaa", "bb", "cc", "abcd", "abcd");
        words2.stream()
                .distinct()
                .filter(s -> s.length() >= 3)
                .forEach(System.out::println);
    }
}