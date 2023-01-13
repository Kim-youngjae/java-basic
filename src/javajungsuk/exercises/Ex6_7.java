package javajungsuk.exercises;

/**
 * getDistance()를 MyPoint클래스의 인스턴스 메서드로 정의하시오
 */

class MyPoint {
    int x;
    int y;

    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getDistance(int x, int y) {
        // 두 점 사이의 거리를 구한다.
        double dx = this.x - x;
        double dy = this.y - y;

        double distance = Math.sqrt(Math.abs(Math.pow(dx, dx) + Math.pow(dy, dy)));



        return distance;
    }


}

public class Ex6_7 {
    public static void main(String[] args) {
        MyPoint p = new MyPoint(1, 1);
        System.out.println(p.getDistance(2,2));
    }
}
