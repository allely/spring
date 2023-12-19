package exam02;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex01 {
    public static void main(String[] args) {
        Set<String> names = new TreeSet<>();
        names.add("이름1");
        names.add("이름2");
        names.add("이름2");   // 집합에는 중복이 적용되지 않는다.
        names.add("이름3");
        names.add("이름4");
        names.add("이름5");

        // HashSet : 출력 순서는 입력순서와 상관이 없이 이진트리에 의해 정렬.
        // TreeSet : 입력순서에 따라 정렬
        System.out.println(names);

    }
}
