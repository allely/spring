package exam01;

import java.util.Arrays;
import java.util.List;

public class Ex02 {
    public static void main(String[] args) {
        // Arrays로 stream 생성
        String[] words1 = { "aaa", "aaa", "bb", "ccc", "ccc", "abcd"};
        Arrays.stream(words1)
                .distinct()     // 중간연산 - 중복제거
                .filter(s -> s.length() >= 3)   // 중간연산 - 3자 이상인 것만
                .forEach(System.out::println);  // 최종연산 - 출력

        // List로 stream 생성
        List<String> words2 = Arrays.asList("aaa", "aaa", "bb", "ccc", "ccc", "abcd");
        words2.stream()
                .distinct()
                .filter(s -> s.length() >= 3)
                .forEach(System.out::println);
                        // stream 내부에서 복사하여 사용하기 때문에 원본 변경 X
        System.out.println(words2);
    }
}