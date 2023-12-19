package exam01;

public class Ex03 {
    public static void main(String[] args) {
        System.out.println(Transportation.BUS instanceof Transportation);
        /* Enum의 모든 상수는 Enum 클래스의 객체.
        public abstract Transportation extends java.lang.Enum {
             public static final Transportation BUS ...
             public static final Transportation SUBWAY ...
             public static final Transportation TAXI

             private Transportation() {}
         }
        */
//        Transportation trans = new Transportation();
        // 상수이기 때문에 생성자로 객체 생성하지 못함.

        System.out.println();
    }
}