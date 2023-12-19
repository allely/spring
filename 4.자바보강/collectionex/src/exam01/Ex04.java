package exam01;

import java.util.Vector;

public class Ex04 {
    public static void main(String[] args) {
        Vector<String> names = new Vector<>(3);
        names.add("이름1");
        names.add("이름2");
        names.add("이름3");
        names.add("이름4");   // capacity를 초과해서 add하면 capacity가 커진다. 초기값만큼?
        System.out.println("capacity : " + names.capacity());
    }
}
