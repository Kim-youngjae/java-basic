package chapter9;

import classpractice.Car;

import java.util.Objects;

class Card {
    String kind;
    int number;

    Card() {
        this("SPADE", 1);
    }

    Card(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    // toString() 오버라이딩하면 hashCode()도 오버라이딩해야 한다.
    public int hashCode() {
        return Objects.hash(kind, number); // 가변인자라 매개변수 개수 상관 없음
    }

    public boolean equals(Object obj) {
        if(!(obj instanceof Card))
            return false;
        Card c = (Card) obj;
        return this.kind.equals(c.kind) && this.number == c.number; // kind가 문자열이라서 equals()사용
    } // toString() 오버라이딩하면 hashCode()도 오버라이딩하기


    // Object toString() 오버라이딩
    public String toString() {
       return "kind:" + kind + " number:" + number;
    }

}

public class Ex9_4 {
    public static void main(String[] args) {
        Card c1 = new Card();
        Card c2 = new Card();

        //System.out.println(c1.equals(c2)); // 오버라이딩 안하고 그냥 사용하면 당연히 false

        //System.out.println(c1.toString()); // chapter9.Card@2f7c7260
        //System.out.println(c2.toString()); // chapter9.Card@2d209079 오버라이딩 안했을 때

        // kind:SPADE number:1
        // kind:SPADE number:1 오버라이딩 했을 때

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
    }
}
