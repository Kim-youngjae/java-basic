package chapter7;

public class Ex7_10 {
    public static void main(String[] args) {
        Unit[] group = {new Marine(), new Tank(), new Dropship()};

        for (int i = 0; i < group.length; i++) {
            group[i].move(100, 200);
        }

        Object gruop2 = new Marine();

        // gruop2.move(100, 200); // 리모콘 타입이 object타입이어서 object에는 move가 없음(에러)
    }
}

abstract class Unit {
    int x, y;

    abstract void move(int x, int y);
    void stop(){ /*현재 위치에 정지*/}
}

class Marine extends Unit {
    @Override
    void move(int x, int y) {
        System.out.println("보병 위치 " + x + " " + y);
    }

    void steamPack(){/*스팀팩 사용*/}
}

class Tank extends Unit {
    @Override
    void move(int x, int y) {
        System.out.println("탱크 위치 " + x + " " + y);
    }

    void ceaseMode() {/* cease mode of tank*/}
}

class Dropship extends Unit {
    @Override
    void move(int x, int y) {
        System.out.println("수송선 위치 " + x + " " + y);
    }

    void dropTroop() {/*drop troops*/}
}