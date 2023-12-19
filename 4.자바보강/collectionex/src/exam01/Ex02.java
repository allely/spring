package exam01;

import java.util.ArrayList;

public class Ex02 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("이름1");
        names.add("이름3");
        names.add("이름5");
        names.add("이름2");
        names.add("이름4");

//        System.out.println(names);
        /*
        for(int i = 0; i < names.size(); i++) {
            names.remove(i);
        }
         */
        /* ArrayList 0번부터 삭제
        순서 :    0   1   2   3   4
        동작전   (1)  2   3   4   5
        i=0 후    2  (3)  4   5
        i=1 후    2   4  (5)
        i=2 후    2   4

        따라서 삭제를 거꾸로 동작해야 전부 지워진다
         */

        for(int i = names.size()-1; i >= 0; i--) {
            names.remove(i);
        }

        for(int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            System.out.println(name);
        }
    }
}
