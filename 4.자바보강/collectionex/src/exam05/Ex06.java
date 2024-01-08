package exam05;

import java.util.*;

public class Ex06 {
    public static void main(String[] args) {
        List<String> strs = new ArrayList<>();
//        Set<String> strs = new HashSet<>();
        Collections.addAll(strs, "a", "b", "c", "d");
        System.out.println(strs);

        Collections.shuffle(strs);  // 무작위 셔플
        System.out.println(strs);

        System.out.println(Collections.max(strs));  // 정렬 후 가장 끝 요소
        System.out.println(Collections.min(strs));  // 정렬 후 가장 앞 요소
    }
}
