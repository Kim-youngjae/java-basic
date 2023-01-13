package chapter7;

class A {
    public void method(I i) { // 인터페이스 I를 구현한 놈들만 들어와라는 의미
        i.method();
    }
}

// B클래스 선언과 구현을 분리
interface I {
    public void method();
}

class B implements I{
    public void method() {
        System.out.println("B 클래스의 메서드");
    }
}

class C implements I{
    public void method() {
        System.out.println("C 클래스 메서드");
    }
}

public class InterfaceTest {
    public static void main(String[] args) {
        A a = new A();
        a.method(new B()); // A가 B를 사용 (의존)

        // 가정(새로운 C가 나와서 C를 쓸려고 함)
//        a.method(new C()); // A가 C를 사용 (의존) --> 에러 발생, A가 요구하는 매개변수가 B이기 때문 --> A가 변경 되어야 한다..
        // A가 B대신 C를 사용하려면 두 곳을 수정해야한다.
        a.method(new C()); // A가 B를 사용 (의존)


    }
}
