package javajungsuk.youtube;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorAndComparableEx {
    public static void main(String[] args) {
        String[] strArr = {"cat", "Dog", "lion", "tiger"};

        Arrays.sort(strArr); // String의 Comparable구현에 의한 정렬
        System.out.println("strArr=" + Arrays.toString(strArr));

        Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); // 대소문자 구분안함
        System.out.println("strArr=" + Arrays.toString(strArr));

        Arrays.sort(strArr, new Descending()); // 역순 정렬
        System.out.println("strArr=" + Arrays.toString(strArr));
    }
}

class Descending implements Comparator {
    public int compare(Object o1, Object o2){
        if( o1 instanceof Comparable && o2 instanceof Comparable) {
            Comparable c1 = (Comparable)o1;
            Comparable c2 = (Comparable)o2;
            return c1.compareTo(c2) * -1 ; // -1을 곱해서 기본 정렬방식의 역으로 변경한다.
            // 또는 c2.compareTo(c1)와 같이 순서를 바꿔도 된다.

        }
        return -1;
    }
}

/**
 * 객체 정렬에 필요한 메서드(정렬 기준 제공)를 정의한 인터페이스
 * 정렬 기준을 제공하는 것이 목적
 *
 */