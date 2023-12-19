package exam02;

public class Ex02 {
    public static void main(String[] args) {
        Calculator cal = new Calculator() {
            @Override
            public int add(int num1, int num2) {
                return num1 + num2;
            }
        };
        add(cal);

        // 같은 동작
        add(new Calculator() {
            @Override
            public int add(int num1, int num2) {
                return num1 + num2;
            }
        });

        // 람다식
        add((a, b) -> a + b);
    }
    public static void add(Calculator cal) {
        int result = cal.add(10, 20);
        System.out.println(result);
    }
}
