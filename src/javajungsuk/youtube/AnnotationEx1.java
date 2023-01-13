package javajungsuk.youtube;

class Parent {
    void parentMethod() {}
}

class Child extends Parent {
    @Override
    @Deprecated
    void parentMethod() {}
}


public class AnnotationEx1 {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Child c = new Child();
        c.parentMethod();
    }
}
