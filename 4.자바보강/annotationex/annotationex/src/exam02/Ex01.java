package exam02;

import java.util.Arrays;

@MyAnno2(value = "값", nums = {10, 20, 30, 40})
                // 속성이 하나라면 "값"이라고 적어도 value="값"으로 인식.
                // 속성 값을 입력하지 않으면 default로 지정된 값을 입력.
                // 배열 내용이 하나라면 중괄호 생략 가능
public class Ex01 {
    public static void main(String[] args) {
        Class cls = Ex01.class;
        MyAnno2 anno = (MyAnno2)cls.getAnnotation(MyAnno2.class);
        String value = anno.value();
        System.out.printf("value=%s%n", value);

        int[] nums = anno.nums();
        System.out.println(Arrays.toString(nums));
    }
}