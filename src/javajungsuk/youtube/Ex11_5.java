package javajungsuk.youtube;

import java.util.*;

public class Ex11_5 {
    public static void main(String[] args) {
        /**
         *        List list = new ArrayList(); //다른 컬렉션으로 변경할 때엔 new ArrayList()만 바꾸면 된다.
         *         Iterator it = list.iterator(); // 컬렉션에 iterator()를 호출해서 Iterator를 구현한 객체를 반환한다.
         *
         *         while (it.hasNext()) {
         *             System.out.println(it.next());
         *         }
         */

        Collection c = new ArrayList();
//        TreeSet c = new TreeSet();
//        Collection c = new HashSet();

        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        c.add(5);

        Iterator it = c.iterator();

        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }

        // iterator()는 일회용이라 다시 얻어와야한다.
//        it = list.iterator();

//        for (int i = 0; i < c.size(); i++) {
//            Object obj = c.get(i);
//            System.out.println(obj);
//        }

    }
}
