package exam02;

public class Outer {
    Calculator method(int num3) {
       return new Calculator() {    // 익명 내부 클래스
            public int add(int num1, int num2) {
//                num3 = 40;    // 지역변수의 상수화(final) : 사라지지 않게.
                return num1 + num2 + num3;
            }
        };
    }
    /*
    void method() {
        class Inner {
            void InnerMethod() {
                System.out.println("지역 내부 클래스!!");
            }
        }

        Inner in = new Inner();
        in.InnerMethod();
    }
     */
}
