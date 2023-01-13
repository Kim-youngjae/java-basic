package chapter6;

class Time {
    private int hour; // 0~23사이의 값을 가져야 한다.
    private int minute;
    private int second;

    public void setHour(int hour) {
        if (isValidHour(hour)) {
            return;
        }
        this.hour = hour;
    }

    // 매개변수로 넘겨진 hour가 유효한지 확인해서 알려주는 메서드
    private boolean isValidHour(int hour) { // 이 메서드는 이 안에서 밖에 안쓰여서 private로 설정하는 것이 좋다
        return hour < 0 || hour > 23;
    }

    public int getHour() {
        return hour;
    }
}


public class TimeTest {
    public static void main(String[] args) {

        Time t = new Time();
        //t.hour = 25; // default(같은 패키지)는 아무 문제 없다 -> private로 바꾸면 접근이 안된다(메서드를 통해 접근 권장; 캡슐화)
        //zSystem.out.println(t.hour);

        t.setHour(21);
        System.out.println(t.getHour());
        t.setHour(-100);
        System.out.println(t.getHour()); // hour 조건에 맞지 않아 데이터가 함부로 변경되는 것을 막음
        
    }
}
