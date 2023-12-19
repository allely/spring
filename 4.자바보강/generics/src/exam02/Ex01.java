package exam02;

public class Ex01 {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box</*Apple-생략가능*/>();
        appleBox.setItem(new Apple());
//        appleBox.setItem(new Pear()); // 타입 명확하게 하여 다른 타입 입력 못함
                                        // 타입의 안정성 확보

//        Apple apple = appleBox.getItem();   // 형변환 필요없음.

        Box<Pear> pearBox = new Box<>();

    }
}
