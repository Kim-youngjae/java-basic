package chapter7;

abstract class Player { // 추상 클래스(미완성 클래스)
    abstract void play(int pos); // 추상 메서드(미완성 메서드; 선언부만 있고 구현부{}가 없는 메서드)
    abstract void stop(); // 추상 메서드
}

class AudioPlayer extends Player {
    void play(int pos) {
        System.out.println(pos + " 위치 부터 재생");
    }

    void stop() {
        System.out.println("재생이 중지되었습니다.");
    }

}

public class PlayerTest {
    public static void main(String[] args) {
//        Player p = new Player(); // 추상 클래스의 객체 생성 -> 에러(미완성이라 제품(객체)을 만들 수 없음)
//        AudioPlayer ap = new AudioPlayer();
        Player ap = new AudioPlayer(); // 가능하다 -> 다형성 실제 기능을 가진 AudioPlayer()객체를 생성하고 Player의 ap가 가리키고 있는 것 그래서 리모콘 타입과 상관이없다
        //실제 호출되는 것이 실제 인스턴스를 가지고 있는지가 중요하다.

        ap.play(100);
        ap.stop();
    }
}
