package javajungsuk.youtube;

import java.util.*;

class HashSetEx5 {
    public static void main(String args[]) {
        HashSet setA    = new HashSet();
        HashSet setB    = new HashSet();
        HashSet setHab = new HashSet();
        HashSet setKyo = new HashSet();
        HashSet setCha = new HashSet();

        setA.add("1");		setA.add("2");
        setA.add("3");		setA.add("4");
        setA.add("5");
        System.out.println("A = "+setA);

        setB.add("4");		setB.add("5");
        setB.add("6");		setB.add("7");
        setB.add("8");
        System.out.println("B = "+setB);

//        Iterator it = setB.iterator();
//        while(it.hasNext()) {
//            Object tmp = it.next();
//            if(setA.contains(tmp))
//                setKyo.add(tmp);
//        }

        // 교집합
//        setA.retainAll(setB);
//        System.out.println("교집합 " + setA);


//        it = setA.iterator();
//        while(it.hasNext()) {
//            Object tmp = it.next();
//            if(!setB.contains(tmp))
//                setCha.add(tmp);
//        }

        // 차집합
        setA.removeAll(setB);
        System.out.println("차집합 " + setA); // setB와 관련 있는 모든 요소를 미포함


//        it = setA.iterator();
//        while(it.hasNext())
//            setHab.add(it.next());
//
//        it = setB.iterator();
//        while(it.hasNext())
//            setHab.add(it.next());

        // 합집합
        setA.addAll(setB);
        System.out.println("합집합 " + setA);// 합집합, setB의 모든 요소를 추가(중복 제외)

        System.out.println("A 교집합 B = "+setKyo);  // �ѱ� ���� ������ ����Ű
        System.out.println("A 합집합 B = "+setHab);  // �ѱ� ���� ������ ����Ű
        System.out.println("A - B = "+setCha);
    }
}