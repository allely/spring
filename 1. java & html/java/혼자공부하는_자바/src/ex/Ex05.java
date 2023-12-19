package ex;

public class Ex05 {
    public static void main(String[] args) {
        try {
            int num1 = 10;
            int num2 = 0;
            int result = num1 / num2;   // ArithmeticException 발생
                                        // -> Runtime(실행) 중 오류 발견
        } catch(ArithmeticException e) {
            System.out.println("예외 처리...");
        }

        System.out.println("매우 중요한 실행 코드...");

        /*
        Exception
            - 컴파일 시저메 예외를 체크 -> 이상 -> 컴파일 x
            - 엄격한 예외, 형식 중요! - 예외가 있든 없든 무조건 예외처리 필요
        RuntimeException
            - 실행 중에 예외를 체크 -> 실행이 되려면? 컴파일 o
            - 유연한 예외, 예외가 발생하는 상황이더라도 실행된다.
            - 예외 발생 -> 중단
                -> 서비스 중단을 막기 위해서 -> 적절한 예외 처리 o

        예외처리 목적 : 서비스 중단을 막기 위한 처리.
        try - catch
        */

    }
}