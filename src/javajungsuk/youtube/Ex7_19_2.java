//package javajungsuk.youtube;
//
//import java.util.Arrays;
//
//public class Ex7_19_2 {
//    public static void main(String[] args) {
//        Buyer b = new Buyer();
//
//        b.buy(new Tv());
//        b.buy(new Computer());
//        b.buy(new Tv());
//        b.buy(new Audio());
//        b.buy(new Computer());
//        b.buy(new Computer());
//        b.buy(new Computer());
//
//        b.summary();
//    }
//}
//
//class Buyer {
//    int money = 1000;
//    Product[] cart = new Product[3];
//    int i = 0;
//
//    void buy(Product p) {
//        //1.1 가진 돈과 물건의 가격을 비교해서 가진 돈이 적으면 메서드를 종료한다
//        if (money < p.price) {
//            System.out.println("잔액이 부족하여 "+ p +"을/를 구매할 수 없습니다");
//            return;
//        }
//        //1.2 가진 돈이 충분하면, 제품의 가격을 가진 돈에서 빼고
//        else {
//            money -= p.price;
//        }
//        //1.3 장바구니에 구입한 물건을 담는다(add()호출
//        add(p);
//    }
//
//    void add(Product p) {
//        //1.1 i 값이 장바구니의 크기보다 같거나 크면
//        if (i >= cart.length) {
//            //1.2 기존의 장바구니보다 2배 큰 새로운 배열을 생성
//            Product[] newCart = Arrays.copyOf(cart, cart.length * 2);//1.3 기존 장바구니 내용을 새로운 배열에 복사한다
//            cart = newCart;        //1.3 새로운 장바구니와 기존의 장바구니를 바꾼다
//        }
//        cart[i++] = p;
//        //2.1 물건을 장바구니 (cart)에 저장하고 i값을 1 증가시킨다
//    }
//
//    void summary() {
//        //1.1 장바구니에 담긴 물건들의 목록을 만들어 출력한다.
//        System.out.print("구입한 물건:");
//        for (int i = 0; i < cart.length; i++) {
//            System.out.print(cart[i].toString() + ", ");
//        }
//        System.out.println();
//        //1.2 장바구니에 담긴 물건들의 가격을 모두 더해서 출력한다.
//        int total = 0;
//        for (Product p : cart) {
//            total += p.price;
//        }
//        System.out.println("사용한 금액:" + total);
//        //1.3 물건을 사고 남은 금액을 출력한다.
//        System.out.println("남은 금액:" + money);
//    }
//}
//
//class Product {
//    int price;
//
//    Product(int price) {
//        this.price = price;
//    }
//}
//
//class Tv extends Product {
//    Tv() {
//        super(100);
//    }
//
//    public String toString() {
//        return "Tv";
//    }
//}
//
//class Computer extends Product {
//    Computer() {
//        super(200);
//    }
//
//    public String toString() {
//        return "Computer";
//    }
//}
//
//class Audio extends Product {
//    Audio() {
//        super(50);
//    }
//
//    public String toString() {
//        return "Audio";
//    }
//}
