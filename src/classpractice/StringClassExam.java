package classpractice;

public class StringClassExam {
    public static void main(String[] args) {
        // new 연산자를 사용하지 않고도 인스턴스를 만들 수 있다
        String str1 = "hello";
        String str2 = "hello";

        String str3 = new String("hello");
        String str4 = new String("hello");

        //참조형은 값을 비교하는 것이 아니라 가리키고 있는 주소 값이 같은지 비교한다.
        if (str1 == str2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        if (str1 == str3) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        if (str3 == str4) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        /**
         * 또한 String클래스는 참조하는 값이 변하지 않는다.(재정의하지 않는 이상...??)
         * 그래서 str1의 경우 내부 함수의 substring()을 사용하여서 반환하는 값은 새롭게 생성한 값을 반환한것이지 원래의 값을 바꾼 것은 아니다.
         */
    }


}
