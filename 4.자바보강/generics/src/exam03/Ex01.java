package exam03;

import exam02.Fruit;

public class Ex01 {
    public static void main(String[] args) {
        FruitBox<Fruit> appleBox = new FruitBox<>();
        appleBox.add(new Apple());  // Apple, Fruit, Object
        appleBox.add(new Apple());
        appleBox.add(new Pear());

        Juicer.make(appleBox);

        FruitBox<Fruit> pearBox = new FruitBox<>();
        pearBox.add(new Pear());
        pearBox.add(new Pear());


        Juicer.make2(pearBox);
    }
}
