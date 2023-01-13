package javajungsuk.youtube;

import java.util.*;

class HashSetLotto {
    public static void main(String[] args) {
        Set set = new HashSet();

        for (int i = 0; set.size() < 6 ; i++) {
            int num = (int)(Math.random()*45) + 1;
            set.add(new Integer(num));
        }

        List list = new LinkedList(set);	// LinkedList(Collection c) Set의 모든 요소를 list로 저장
        Collections.sort(list);				// Collections.sort(List list) list를 정렬
        System.out.println(list);           // 출력
    }
}