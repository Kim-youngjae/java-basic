package chapter7;

public class MyPolymorphism {
    public static void main(String[] args) {
        Buyer b = new Buyer();

//        Product p = new TV();
//        b.buy(p); //밑의 줄과 동일한 결과를 실행하지만 차이점이라면 이 두줄은 main에서 참조변수 p를 생성하지만 밑은 참조변수가 없어 main에서 사용할 수 없다.
        b.buy(new TV());
        b.buy(new Computer());

        System.out.println("현재 남은돈은 " + b.money + "만원");
        System.out.println("핸재 보너스 점수 " + b.bonusPoint + "점");
    }
}

/**
 * 다형성이란
 * - 조상 타입 참조 변수로 자손 타입 객체를 다루는 것
 * 객체 생성의 타입이 불일치 되는 것이 허용
 *
 * <정리>
 *     다형성
 *
 *     1.
 *     참조변수의 타입은 인스턴스 타입과 반드시 일치해야 하나요?
 *     -> 아닙니다. 일치하는 것이 보통이지만 일치하지 않을 수도 있습니다.
 *     SmartTV s = new smartTv() // 참조변수와 인스턴스 타입이 일치
 *     Tv t = new SmartTv() // 조상 타입 참조변수로 자손 타입 인스턴스 참조
 *
 *     2.
 *     참조변수의 형변환(리모콘 바꾸기)
 *     사용할 멤버 갯수 조절을 위함
 *
 *     3. instanceof 연산자
 *     형변환 가능여부 확인을 위해
 *
 */

/**
 * <매개변수의 다형성 장점>
 * 1. 다형적 매개 변수
 * -    참조형 매개변수는 메서드 호출 시, 자신과 같은 타입 또는 자손 타입의 인스턴스를 넘겨줄 수 있다.
 * <p>
 * 2. 하나의 배열로 여러종류 객체를 다룰 수 있다.
 */


// 매개변수 다형성 1번 예시: 예를 들어 다음의 경우를 보자
class Product {
    int price; //제품 가격
    int bonusPoint; // 보너스 점수

    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
}

class TV extends Product {
    TV() {
        super(100);
    }

    public String toString() {
        return "TV";
    }
}
class Computer extends Product {
    Computer() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }
}
class Audio extends Product {
    Audio() {
        super(300);
    }

    public String toString() {
        return "Audio";
    }
}

class Buyer { // 물건을 사는 사람
    int money = 1000; // 소유 금액
    int bonusPoint = 0; // 보너스 점수
/*
    // buyer클래스에 buy메서드를 추가하려고 하는데
    void buy(TV t) { // 이곳에는 new TV()는 가능하다
        money -= t.price;
        bonusPoint += t.bonusPoint;
    }

    //다른 타입의 매개변수를 받기 위해
    void buy(Computer c) { // 이처럼 다른 타입을 받기위해 오버로딩을 해야하는데 계속 이렇게 추가하기엔 중복이 심하다
        money -= c.price;
        bonusPoint += c.bonusPoint;
    }*/

    //그래서 TV 타입말고 조상인 Product 타입으로 매개변수를 설정
    void buy(Product p) { // 이렇게 되면 하나의 메서드로 여러 물건을 매개변수로 가능
        money -= p.price;
        bonusPoint += p.bonusPoint;
//        System.out.println(p.toString() + "을/를 구입하였습니다.");
        System.out.println(p + "을/를 구입하였습니다.");
    }
}