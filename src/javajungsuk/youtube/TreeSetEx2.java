package javajungsuk.youtube;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx2 {
    public static void main(String[] args) {
        Set set = new TreeSet(); // set이지만 오름 차순으로 정렬이 되어서 나온다. 범위 검색과 정렬에 유리하다. 정렬이 되어서 나오기 때문에 정렬 필요 없음

//        Set set = new HashSet(); // 정렬 필요 링크드 리스트로 옮긴다음 정렬 징크스 -> 순서가 중요


//        for (int i = 0; set.size() < 6; i++) {
//            int num = (int) (Math.random() * 45) + 1;
//            set.add(num); // = set.add(new Integer(num)); // Integer는 Comparable이 구현되어 있다(자체 정렬 기준 있음)
//        }
        set.add(new Test()); // 원래는 에러가 나야한다 set의 add()는 비교 기준이 있어야 하는데 없기 때문
        set.add(new Test());
        set.add(new Test());
        set.add(new Test());

        System.out.println(set);
    }
}

class Test implements Comparable{  // Comparator 인터페이스는 Set set = new TreeSet(new TestComp());와 같이 비교 기준을 넣어주어야 했지만 Comparable은 필요 없음
    @Override
    public int compareTo(Object o) {
        return 0;
    }
} // 비교 기준이 없음

class TestComp implements Comparator {
    public TestComp() {
    }

    @Override
    public int compare(Object o1, Object o2) {
        return -1;
    }
}

/**
 * TreeSet은 이진탐색 트리로 구현되어 있어 비교 기준이 필요하기 때문에 Comparator와 Comparable인터페이스 둘중에 하나를 구현해주어야 한다.
 * 저장하는 객체가 Comparable을 가지고 있던지 TreeSet자체가 어떤 정렬 기준을 갖도록 해야한다.
 */

