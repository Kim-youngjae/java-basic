package chapter7;

/**
 * 클래스에서 외부 접근을 막는다.
 * 클래스내의 메소드를 통해 간접접근은 허용한다.
 */

class Time {
    private int hour; // 0-23사이의 값을 가져야 함
    int minute;
    int second;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if(isValidHour(hour)) return;

        this.hour = hour;
    }

    private boolean isValidHour(int hour) {
        return hour < 0 || hour > 23;
    }
}

public class MyCapsulation {
    public static void main(String[] args) {
        Time t = new Time();
//        t.hour = 100; // 에러
//        System.out.println(t.hour);

        t.setHour(21);
        System.out.println(t.getHour());
        t.setHour(100);
        System.out.println(t.getHour());

    }

}
