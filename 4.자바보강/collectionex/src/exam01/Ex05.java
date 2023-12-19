package exam01;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex05 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("이름1");
        names.add("이름2");
        names.add("이름3");
        names.add("이름4");
        names.add("이름5");

        Iterator<String> iter = names.iterator();
        // Iterator에서 사용하는 반복자 사용
        // 반복은 한번만 가능하다. (커서가 이동하는 것)
        while(iter.hasNext()) {
            String name = iter.next();
            System.out.println(name);
        }

        iter = names.iterator();    // 커서 초기화
        while(iter.hasNext()) {
            String name = iter.next();
            System.out.println(name);
        }
        /*
        for(String name : names) {  // 향상된 for문 - 컬렉션, 배열
            System.out.println(name);
        }
        // 같은 동작 - 스프링에서 사용
        names.forEach(System.out::println);
         */
    }
}
