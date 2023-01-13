package chapter7;

class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Point3D extends Point {
    int z;

    /*
    Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }*/

    /**
     * 인텔리J 에서는 에러를 발생시킨다
     * 자손의 생성자는 자기가 선언한 것 (int z)만 초기화해야한다.
     * <p>
     * 그래서 원래 부모가 가지고 있던 멤버변수는 super()를 통해 초기화한다.
     * <p>
     * 추가 조건 super()
     * 생성자의 첫 줄에 반드시 생성자를 호출해야한다. 중요!!!!!
     * 그렇지 않으면 컴파일러가 생성자의 첫 줄에 super();를 삽입한다.
     */

    Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
}

public class MySuperConstructor {
    public static void main(String[] args) {
        Point3D p3 = new Point3D(1, 2, 3);
    }
}
