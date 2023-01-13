package classpractice;

public class VariableScopeStaticExam {

    int globalScope = 10; // 이렇게 선언된 변수는 포함하는 클래스 전체이다.
    static int staticVal = 30;

    public void scopeTest(int value) {
        int localScope = 20;
        System.out.println(globalScope); // 에러가 안뜬걸로 보아 globalScope는 메서드 내에서도 사용할 수 있다는 것을 알 수 있다.
        System.out.println(localScope);
        System.out.println(value);
    }

    public void scopeTest2(int value2) {
        System.out.println(globalScope); // 에러가 안뜬걸로 보아 globalScope는 메서드 내에서도 사용할 수 있다는 것을 알 수 있다.
//        System.out.println(localScope); // 사용 불가
        System.out.println(value2); // 사용가능
    }
    public static void main(String[] args) {
//        System.out.println(globalScope); // 클래스 내에 있는데도 main 안에서는 사용이 불가하다
//        System.out.println(localScope);
//        System.out.println(value); // 위 두개는 당연히 불가능

        System.out.println(staticVal); // 오류없이 사용할 수 있음

        /**
         * 키워드 static을 사용하면 인스턴스화 하지 않아도 사용할 수 있다.
         */

        VariableScopeStaticExam v1 = new VariableScopeStaticExam();
        System.out.println(v1.globalScope); // 이렇듯 인스턴스화 한 뒤에 접근이 가능하다.

        VariableScopeStaticExam v2 = new VariableScopeStaticExam();
        v1.staticVal = 50;
        v2.staticVal = 100;
        /**
         * staticVal의 경우 static으로 저장되는데 이는 객체가 다르더라도 변수의 값을 공유한다.
         * 그래서 두 객체의 staticVal값이 같게 출력
         *
         * 정리! -> 클래스 변수 = static한 변수, 값을 저장할 공간이 하나 밖에 없어서 값을 공유한다.
         * 그래서 객체를 생성하면서 정한 객체의 이름을 사용하는 것이 아닌 클래스 본연의 이름을 사용할 수 있다.
         * 클래스이름.클래스변수명 -> 가능
         */

        System.out.println(v1.staticVal);
        System.out.println(v2.staticVal);

    }
}
