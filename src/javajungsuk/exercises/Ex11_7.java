package javajungsuk.exercises;

import java.util.*;

public class Ex11_7 {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();

        list.add(new Student3("홍길동", 1, 3, 100, 100, 100));
        list.add(new Student3("남궁성", 1, 1, 90, 70, 80));
        list.add(new Student3("김자바", 1, 2, 80, 80, 90));
        list.add(new Student3("이자바", 2, 1, 70, 90, 70));
        list.add(new Student3("안자바", 2, 2, 60, 100, 80));

        Collections.sort(list, new BanNoAscending());

        Iterator it = list.iterator();
        while (it.hasNext())
            System.out.println(it.next());
    }
}

class Student3 implements Comparable{
    String name;
    int ban;
    int no;
    int kor, eng, math;

    Student3(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    int getTotal() {
        return kor+eng+math;
    }

    float getAverage() {
        return (int)((getTotal() / 3f) * 10 + 0.5)/10f;
    }

    public String toString() {
        return name + ", " + ban + ", " + no + ", " + kor + ", " + eng + ", " + math
                + ", " + getTotal() + ", " + getAverage();
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Student3)) {
            return 0;
        }
        Student3 s = (Student3) o;
        return this.name.compareTo(s.name);
    }
}

class BanNoAscending implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        // ban, no로 오름 차순 정렬되게 하시오
        if (!(o1 instanceof Student3 && o2 instanceof Student3)) {
            return -1;
        }

        Student3 s1 = (Student3) o1;
        Student3 s2= (Student3) o2;

        return (s1.ban == s2.ban ? s1.no - s2.no : s1.ban - s2.ban); // 오름차순으로 정렬: o1 - o2
    }
}