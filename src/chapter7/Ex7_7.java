package chapter7;

import java.io.FileReader;

class Car {
    String color;
    int door;

    void drive() {
        System.out.println("Brrr");
    }

    void stop() {
        System.out.println("stop");
    }
}

class FireEngine extends Car {
    void water() {
        System.out.println("물을 뿌립니다");
    }
}

public class Ex7_7 {
    public static void main(String[] args) {
//        Car c = null;
//        FireEngine fe = new FireEngine();
//        FireEngine fe2 = null;
//        fe.water(); // 가능
//        c = fe;
//        c.water(); // 에러 원래 Car 타입에는 water() 기능이 없다
//        fe2 = (FireEngine) c;
//        fe2.water();
//        Car car = null;
//        FireEngine fe = null;
//        FireEngine fe2 = (FireEngine) car;
//        Car car2 = (Car) fe2; // 실행하면 NullPointerException

//        car2.drive(); // 결국 참조하려는 객체가 null 이기 때문

        Car car = new Car();
        FireEngine fe = (FireEngine) car;
        fe.water();

    }
}
