package exam02;

public class Box<T extends Fruit> {   /*  <T>는 형식에 맞지 않는다.
                            컴파일 시점에서 <T>는 제거되고
                            T는 Object로 변환되어 컴파일된다.
                                (extends Fruit 한다면 Fruit로 변환되어 컴파일된다.)
                            !!그리고 객체 생성할 때 자료형이 명확히 정해진다.!!
                        */
    private  T item;            // T는 instance 만 사용할 수 있다.

//    private static T item2;   // static은 처음부터 활성화되어있어야 하므로
                                // 객체 생성 시 결정되는 T 타입을 사용할 수 없다.
//    private T[] item3 = new T[];    // 자료형과 배열의 공간이 명확하지 않기 때문에 사용할 수 없다.

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public void printItem() {
        // T -> Object, 객체를 만드는 시점에 투입된 타입으로 형변환
        // item.print() 보이지 않음.

        // T -> Fruit, 객체를 만드는 시점에 투입된 타입으로 형변환
        // 추상클래스 Fruit에 추상메서드 print()를 선언해
        //      여기서도 print()를 볼 수 있다.
        item.print();
    }

    // 지네릭 메서드 - 메서드가 호출될 때 타입이 결정
    public <T> void testMethod(T t) {

    }
}