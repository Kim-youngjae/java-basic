package javajungsuk.youtube;

import java.util.ArrayList;

class Fruit implements Eatable {
    public String toString() {return "Fruit";}
}

class Apple extends Fruit {public String toString() {return "Apple";} }
class Grape extends Fruit {public String toString() {return "Grape";} }
class Toy                 {public String toString() {return "Toy";}}

interface Eatable{}


public class Ex12_3 {
    public static void main(String[] args) {
        FruitBox<? extends Fruit> fBox = new FruitBox<Fruit>(); // new 앞에 (FruitBox<? extends Fruit>) 생략
        // FruitBox<Apple> -> FruitBox<? extends Fruit> 가능
        FruitBox<? extends Fruit> aBox = new FruitBox<Apple>();
        FruitBox<Apple> appleBox = (FruitBox<Apple>) aBox; // 인텔리J에서는 명확하게 바꿔주어야 형변환 가능,,
    }
}

class FruitBox<T extends Fruit & Eatable> extends Box<T> {}

class Box<T> {
    ArrayList<T> list = new ArrayList<>();

    void add(T item) {
        list.add(item);
    }
    T get(int i){
        return list.get(i);
    }
    int size() {
        return list.size();
    }
    public String toString(){
        return list.toString();
    }
}
