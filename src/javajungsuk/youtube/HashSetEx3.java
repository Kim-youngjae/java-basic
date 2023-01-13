package javajungsuk.youtube;

import java.util.*;

class HashSetEx3 {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add("abc");
        set.add("abc"); // 얘는 저장이 안된다.
        set.add(new Person("David",10));
        set.add(new Person("David",10)); // 위 라인과 동일하지만 중복으로 인식 못하는 경우이다

        System.out.println(set);
    }
}

// Person클래스의 equals(), hashCode()를 오버라이딩 하지 않았기 때문이다.
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name +":"+ age;
    }

    @Override
    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Person person = (Person) o;
//        return age == person.age && Objects.equals(name, person.name);

        if (!(o instanceof Person)) {
            return false;
        }
        Person p = (Person) o;
        return this.name.equals(p.name) && this.age == p.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}