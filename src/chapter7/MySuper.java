package chapter7;

class Parent {
    int x = 10;
}

class Child extends Parent {
    int x = 20;

    void method() {
        System.out.println("x = " + x);
        System.out.println("this.x = " + this.x);
        System.out.println("super.x = " + super.x);

    }
}
public class MySuper {
    /**
     * this: lv, iv 구별에 사용된다
     * super: 조상멤버와 자식멤버 구분을 위해 사용된다.
     *
     * 상속을 받아도 이름이 겹칠 수 있다 이를 사용할 때 구분을 지어주기 위해서 this와 super를 사용하는 것이다.
     *
     */
    public static void main(String[] args) {
        Child c = new Child();
        c.method();
    }
}
