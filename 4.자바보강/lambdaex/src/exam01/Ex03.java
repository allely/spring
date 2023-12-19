package exam01;

public class Ex03 {
    public static void main(String[] args) {
        Calculator cal = num -> num * num;
            // 인터페이스에 반환값, 매개변수 자료형 선언되어있어 표시하지 않아도 괜찮다.

        int result = cal.square(10);
        System.out.println(result);


    }
}
