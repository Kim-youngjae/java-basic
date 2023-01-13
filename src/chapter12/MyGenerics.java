package chapter12;

import java.util.ArrayList;

/**
 * 지네릭스란
 *
 * 컴파일시 타입을 체크해 주는 기능
 */

public class MyGenerics {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(); //<>안에 타입을 지정해주어 다른 타입이 추가되는 것을 사전에 막아준다

        list.add(10);
        list.add(20);
//        list.add("30"); // String을 추가
        list.add(30);

//        Integer i = (Integer) list.get(2); // list.get(2)가 Object타입이라 Integer로 형변환이 가능해 컴파일 OK -> 컴파일러의 한계
        // 근데 컴파일할 때에는 에러가 뜨지 않지만 실행할 때 에러가 발생 (ClassCastException 형변환 에러) -> 실행시 발생하는 에러
        Integer i = list.get(2); // 형변환은 생략 가능

        System.out.println(list);

        ArrayList<Object> list2 = new ArrayList<Object>(); //<>안에 타입을 지정해주어 다른 타입이 추가되는 것을 사전에 막아준다

        list2.add(10);
        list2.add(20);
        list2.add("30"); // Object타입이라 추가가 가능

        String i2 = (String) list2.get(2);

    }

}
