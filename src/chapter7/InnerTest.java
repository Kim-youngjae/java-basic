package chapter7;

class AA {
    int i = 100;
    BB b = new BB();
    class BB {
        //A의 i변수를 사용하려고 함
        void method() {
//            AA a = new AA();
//            System.out.println(a.i);
            System.out.println(i); // 객체 생성 없이 바로 A의 멤버변수 사용가능함
        }
    }
}

//class CC {
//    BB b = new BB(); // B를 A안에 집어넣으니까 C에서 접근 못함
//}

public class InnerTest {
    public static void main(String[] args) {
//        BB b = new BB();
//        b.method();
        // B는 더이상 독립적인 클래스가 아니라서 A의 객체를 생성 후에 생성가능 B는 A의 멤버처럼 쓰임
    }
}
