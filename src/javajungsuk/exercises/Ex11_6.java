package javajungsuk.exercises;

import java.util.*;

public class Ex11_6 {

    static int getGroupCount(TreeSet tset, int from, int to) {
        Student3 s1 = new Student3("", 0, 0, from, from, from);
        Student3 s2 = new Student3("", 0, 0, to, to, to); // kor, eng, math를 getAverage()를 하면 from ~ to가 나오니까

        return tset.subSet(s1, s2).size();
    }

    public static void main(String[] args) {

        TreeSet set = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (!(o1 instanceof Student3 && o2 instanceof Student3)) {
                    return -1;
                }
                Student3 s1 = (Student3) o1;
                Student3 s2= (Student3) o2;

                return (int) ((s1.getAverage() - s2.getAverage()));
            }
        });


        set.add(new Student3("홍길동", 1, 1, 100, 100, 100));
        set.add(new Student3("남궁성", 1, 2, 90, 70, 80));
        set.add(new Student3("김자바", 1, 3, 80, 80, 90));
        set.add(new Student3("이자바", 1, 4, 70, 90, 70));
        set.add(new Student3("안자바", 1, 5, 60, 100, 80));

        Iterator it = set.iterator();

        while (it.hasNext())
            System.out.println(it.next());

        System.out.println("[60 ~ 69] : " + getGroupCount(set, 60, 70));
        System.out.println("[70 ~ 79] : " + getGroupCount(set, 70, 79));
        System.out.println("[80 ~ 89] : " + getGroupCount(set, 80, 89));
        System.out.println("[90 ~ 100] : " + getGroupCount(set, 90, 101)); // 100 해버리면 100점 포함 안됨
    }
}

class Student2 implements Comparable{
    String name;
    int ban;
    int no;
    int kor, eng, math;

    Student2(String name, int ban, int no, int kor, int eng, int math) {
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
