package javajungsuk.youtube;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class Ex11_1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);

        list1.add(5); // 밑의 코드와 동일한 의미를 가진다. 원래 ArrayList에는 기본형을 바로 넣을 수 없다. 하지만 autoboxing기능 때문에 밑의 코드와 동일하게 해석된다.
//        list1.add(new Integer(5));
        list1.add(new Integer(4));
        list1.add(new Integer(2));
        list1.add(new Integer(0));
        list1.add(new Integer(1));
        list1.add(new Integer(3));

        ArrayList list2 = new ArrayList(list1.subList(1, 4)); // subList()는 읽기 전용이어서 이처럼 ArrayList로 만들어줘야 한다.
        //하지만 읽기만 할거면 new ArrayList() 안해도 된다.

        print(list1, list2);

        //Collection은 인터페이스 Collections는 유틸클래스
        Collections.sort(list1);
        Collections.sort(list2);
        print(list1, list2);

        System.out.println("list1.containsAll(list2) = " + list1.containsAll(list2)); // 모든 요소를 포함하고 있는지

        list2.add("B");
        list2.add("C");
        list2.add(3, "A"); // 3번 인덱스 위치에 값 추가
        print(list1, list2);

        list2.set(3, "AA");
        print(list1, list2);


        list1.add(0, "1");
        System.out.println(list1.indexOf("1"));
        System.out.println(list1.indexOf(1));
        print(list1, list2);

        list1.remove(5);

        // remove() 사용 시 주의할 점
        list1.remove(1); // 1번 인덱스의 객체가 사라진다
        list1.remove(new Integer(1)); // 1의 값이 있는 부분이 삭제

        //list1 과 list2의 겹치는 부분만 남기고 다 삭제
        System.out.println(list1.retainAll(list2));
        print(list1, list2);

    }

    private static void print(ArrayList list1, ArrayList list2) {
        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);
    }
}

/**
 * ArrayList 실습
 */
