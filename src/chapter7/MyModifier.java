package chapter7;

/**
 * 제어자
 * 클래스와 클래스의 멤버(멤버변수, 메서드)에 부가적인 의미 부여
 * 1. 접근 제어자 public, protected, (default;아무것도 안붙이는 것), private -> 4개중에 하나만 붙일 수 있다.
 * 2. 그 외 static, final, abstract, ,,,,
 * <p>
 * 클래스 앞의 final - 마지막의, 변경될 수 없는, 상속 계층도에서 제일 마지막
 * 메서드 앞의 final: 변경될 수 없는 메서드, 오버라이딩을 통해 재정의 될 수 없음 오버라이딩을 못하게 막는 용도
 * 멤버/ 지역변수 앞의 final: 변수앞에 final이 붙으면 값을 변경할 수 없는 상수가 된다.
 * <p>
 */


 /**
 * abstract - 추상의, 미완성의
 * 클래스 앞의 abstract: 추상 메서드가 선언되어 있는(포함한) 클래스를 추상 클래스라고 한다.
 * 메서드 앞의 abstract: 몸통({ })이 없는 메서드를 추상 메서드라함.
 * 즉, 추상 메서드는 미완성 메서드라고 한다. -> 이러면 클래스 역시 미완성
 * 그래서 추상 클래스는 미완성 클래스이므로 객체 생성이 안된다.
  *
  * 추상클래스를 상속받아서 완전한 클래스를 만든 후에 객체 생성가능
 */

abstract class AbstractTest {
    abstract void move();
}

class MyParent {
    private int prv; // 같은 클래스
    int dft; // 깉은 패키지
    protected int prt; // 같은 패키지 + 자손(다른 패키지)
    public int pub; // 접근 제한 없음

    public void printMembers() {
        System.out.println(prv);
        System.out.println(dft);
        System.out.println(prt);
        System.out.println(pub);
    }
}

public class MyModifier {
    public static void main(String[] args) {
        MyParent p = new MyParent();
        // System.out.println(p.prv); // 에러
        System.out.println(p.dft);
        System.out.println(p.prt);
        System.out.println(p.pub);
    }
}
