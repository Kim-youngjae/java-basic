package javajungsuk.youtube;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class GenericEx3 {
    public static void main(String[] args) {
        HashMap<String, Student> map = new HashMap<>(); // 이름이 Key이고 Student 객체를 value로 저장 new 생성자의 타입 지정 생략 가능 (참조변수의 타입과 당연히 일치하므로)

        map.put("자바왕", new Student("자바왕", 1, 1, 100, 100, 100));
        map.put("김자바", new Student("김자바", 1, 2, 70, 80, 90));

        Student s = map.get("자바왕"); // 원래는 get()이 반환하는 타입이 Object이므로 (Student)로 형변환해줘야 하는데 <>때문에 생략가능

        System.out.println(map.get("김자바").name);
    }
}
class Student {
    String name = "";
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    public Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
}
