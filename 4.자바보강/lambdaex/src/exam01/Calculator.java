package exam01;

@FunctionalInterface    // 람다식을 유도
public interface Calculator {
    int square(int num);
    
//    int root(int num);

    // 람다식으로 사용할 때는 하나의 메서드만 설정할 수 있다.
    // -> @FuctionalInterface  사용
}