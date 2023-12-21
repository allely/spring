package exam04;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex06 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Oange", "Mango", "Melon");

        String str = fruits.stream()
                .collect(Collectors.joining(","));
                        // 콤마로 묶어서 출력할 수 있도록
        System.out.println(str);
    }
}
