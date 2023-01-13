package javajungsuk.youtube;

class A {
    public void methodA(I i) {
        i.methodB();
    }
}

class B implements I{
    public void methodB() {
        System.out.println("methodB()");
    }
}

class C implements I {
    public void methodB() {
        System.out.println("methodB() in C");
    }
}

interface I {
    public abstract void methodB();
}

class InterfaceEx {
    public static void main(String args[]) {
        A a = new A();
        a.methodA(new B());
        a.methodA(new C());
    }
}

interface Fightable extends Movable, Attackable {}
// Fightable인터페이스는 멤버가 하나도 없는 것 처럼 보이지만
// Movable, Attackable을 상속받아 멤버 변수가 2개

interface Movable {
    void move(int x, int y); // public abstract가 생략되어 있다.
}

interface Attackable {
    void attack(Unit2 u);
}

class Unit2 { }

class Fighter extends Unit2 implements Fightable { // Fighter 클래스는 Fightable 인터페이스를 구현했다
    @Override
    public void move(int x, int y) {// 메서드의 구현부
    }

    @Override
    public void attack(Unit2 u) {
        // 구현부
    }
}


abstract class AbsTest {
    void method() {
        System.out.println("abstract가 생략된 method");
    }

    abstract void method3();
}