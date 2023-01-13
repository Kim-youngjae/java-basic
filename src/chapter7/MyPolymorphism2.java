package chapter7;

/**
 * <다형성의 장점 2 번째>
 *     하나의 배열에 원래는 같은 타입만 저장할 수 있었는데
 *
 *     하나의 배열에 여러 종류의 객체를 저장할 수 있다.
 *
 */

class Product2 {
    int price; //제품 가격
    int bonusPoint; // 보너스 점수

    Product2(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
}

class TV2 extends Product2 {
    TV2() {
        super(100);
    }

    public String toString() {
        return "TV";
    }
}
class Computer2 extends Product2{
    Computer2() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }
}
class Audio2 extends Product2 {
    Audio2() {
        super(300);
    }

    public String toString() {
        return "Audio";
    }
}

class Buyer2 { // 물건을 사는 사람
    int money = 1000; // 소유 금액
    int bonusPoint = 0;

    Product2 cart[] = new Product2[10]; // 구입한 물건을 담을 배열

    int i = 0;

    void buy(Product2 p) { // 이렇게 되면 하나의 메서드로 여러 물건을 매개변수로 가능
        if (money < p.price) {
            System.out.println("잔액 부족");
            return;
        }

        money -= p.price;
        bonusPoint += p.bonusPoint;
//        System.out.println(p.toString() + "을/를 구입하였습니다.");
        System.out.println(p + "을/를 구입하였습니다.");
        cart[i++] = p; // 카트에 저장
    }

    void summary() {
        int sum = 0;
        String itemList = "";
        for (int i = 0; i < cart.length; i++) {
            if(cart[i] == null) break;
            sum += cart[i].price;
            itemList += cart[i] + ", ";
        }
        System.out.println("구매한 물건의 총 가격 " + sum);
        System.out.println("구매한 물건은 " + itemList + "입니다.");
    }
}

public class MyPolymorphism2 {
    public static void main(String[] args) {
        Buyer2 b = new Buyer2();

        b.buy(new TV2());
        b.buy(new Computer2());
        b.buy(new Audio2());

        System.out.println("현재 남은돈은 " + b.money + "만원");
        System.out.println("현재 보너스 점수 " + b.bonusPoint + "점");
        b.summary();
    }
}
