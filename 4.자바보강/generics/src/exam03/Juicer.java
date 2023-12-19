package exam03;

import exam02.Fruit;

public class Juicer {
    /*
    public static void make(FruitBox<Apple> appleBox) {
    }
    public static void make(FruitBox<Pear> PearBox) {
    }
    */
    /*
        컴파일러가 <>안의 내용을 지우기 때문에
        같은 메서드로 본다.
        -> 와일드카드를 사용 => <?>
     */
    public static void make(FruitBox<? super Apple> fruitBox) {
        System.out.println(fruitBox.getItems());
    }

    public static <T extends Fruit> void make2(FruitBox<T> fruitBox) {
        System.out.println(fruitBox.getItems());
    }
}
