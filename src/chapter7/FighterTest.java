package chapter7;

abstract class Unit2 {
    int x, y;

    abstract void move(int x, int y);

    void stop() {
        System.out.println("멈춤");
    }
}

interface Fightable { // 모든 인터페이스에서 예외없이 public abstract
    void move(int x, int y); // public abstract 가 생략됨

    void attack(Fightable f);
}

class Fighter extends Unit2 implements Fightable {
    @Override // 오버라이딩 규칙: 조상 public 보다 접근 제어자가 범위가 좁으면 안된다.
    public void move(int x, int y) {
        System.out.println(x + ", " + y + "로 이동");
    }

    @Override
    public void attack(Fightable f) {
        System.out.println(f + "을/를 공격");
    }

    Fightable getFightable() { // 싸울 수 있는 상대를 불러온다.
        Fighter f = new Fighter(); // 파이터를 생성해서 반환
        return f;
    }
}


public class FighterTest {
    public static void main(String[] args) {
        Fighter f = new Fighter();
        Unit2 u = new Fighter();

        Fightable f2 = f.getFightable();

//        Fightable f = new Fighter();
/*
        u.move(100, 150);
//        u.attack(new Fighter()); // Unit2에는 attack() 구현 x
        u.stop(); // 에러

        f.move(100, 150);
        f.attack(new Fighter());
//        f.stop(); // Fightable에는 stop()이 없어서 호출 불가
*/

    }
}
