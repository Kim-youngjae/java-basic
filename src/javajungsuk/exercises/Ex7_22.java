package javajungsuk.exercises;

class Circle extends Shape {
    double r;

    Circle(double r) {
        this(new Point(1,1), r);
    }

    Circle(Point p, double r) {
        super(p);
        this.r = r;
    }

    @Override
    double calcArea() {
        double area = Math.PI * r * r;
        return area;
    }
}

class Rectangle extends Shape {
    double width;
    double height;

    Rectangle(double width, double height) {
        this(new Point(0, 0), width, height);
    }

    Rectangle(Point p, double width, double height) {
        super(p);
        this.width = width;
        this.height = height;
    }

    @Override
    double calcArea() {
        double area = width * height;
        return area;
    }

    public boolean isSquare() {
        if ((width > 0) && (height > 0) && (width == height)) {
            return true;
        } else {
            return false;
        }
    }
}

abstract class Shape {
    Point p;

    Shape() {
        this(new Point(0, 0));
    }

    Shape(Point p) {
        this.p = p;
    }

    abstract double calcArea();

    Point getPosition() {
        return p;
    }

    void setPosition(Point p) {
        this.p = p;
    }
}

class Point {
    int x;
    int y;

    Point() {
        this(0, 0);
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "[" + x + "," + y + "]";
    }
}

public class Ex7_22 {
    public static void main(String[] args) {
        Shape[] arr = {new Circle(5.0), new Rectangle(3, 4), new Circle(1)};
        System.out.println("면적의 합 = " + sumArea(arr));
    }

    public static double sumArea(Shape[] arr) {
        double result = 0.0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i].calcArea();
        }
        return result;
    }
}
