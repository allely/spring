package exam01;

public class Ex01 {
    public static void main(String[] args) {
        Integer num1 = new Integer(10);
        Integer num2 = new Integer(10);
        long num3 = num1.longValue();

        System.out.println((num1 == num2));         // false
        System.out.println((num1.equals(num2)));    // true

        System.out.println("num1 = " + System.identityHashCode(num1));
        System.out.println("num2 = " + System.identityHashCode(num2));
        // 각각 다른 객체이므로 다른 주소를 갖는다.

        ///////////////////// 권장하는 방법.
        Integer num4 = Integer.valueOf(10);
        Integer num5 = Integer.valueOf(10);

        System.out.println(num4 == num5);         // false
        System.out.println((num1.equals(num2)));    // true

        System.out.println("num4 = " + System.identityHashCode(num4));
        System.out.println("num5 = " + System.identityHashCode(num5));

    }
}
