package chapter9;

class Value {
    int value;

    Value(int value) {
        this.value = value;
    }

    // Object의 equals()를 오버라이딩하여 주소값이 아닌 value(iv)값을 비교
    public boolean equals(Object obj) {
        // 참조변수 형변환 전에는 instanceof로 확인을 해야한다.
        if(!(obj instanceof Value))
            return false;
        Value v = (Value) obj;
        return this.value == v.value; // 원래 함수는 주소비교. 주소비교 시 서로 다른 객체는 항상 거짓
    }
}

public class Ex9_1 {
    public static void main(String[] args) {
        Value v1 = new Value(3);
        Value v2 = new Value(3);

        System.out.println(v1.equals(v2));
    }
}
