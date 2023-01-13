package chapter6;

public class Chapter6_39 {

    /**
     * 멤버 변수 초기화에는 2가지가 있다.
     * <p>
     * 1. 명시적 초기화
     * class Car {
     * int door = 4; 기본형 변수의 초기화
     * Engine e = new Engine(); 참조형 변수의 초기화
     * }
     * <p>
     * 2. 초기화 블럭 -> 복잡한 초기화에 활용, 여러문장을 넣을 때
     * 인스턴스 초기화 블럭 {}
     * 클래스 초기화 블럭 static {}
     * <p>
     * 3. 생성자 -> iv 초기화, 복잡한 초기화
     */

    // static 블럭 초기화 예시
    static int[] arr = new int[10]; // 명시적 초기화

    static {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10) + 1;
        }
    }


    /**
     * 클래스 변수 초기화 시점: 클래스가 처음 로딩될 때 단 한번(메모리 올라갈 때)
     * 인스턴스 변수 초기화 시점: 인스턴스가 생성될 때 마다. (반복될 수 있음. 객체가 생성될 때 마다)
     *
     *
     * 1. cv -> iv 순서
     * 2. 자동(0으로 초기화) -> 간단(대입연산자에 의한 = ) -> 복잡 ((static) {}, 생성자)
     *
     */

}
