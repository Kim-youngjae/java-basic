package chapter9;

import java.util.ArrayList;

public class Ex9_28 {

    public static void main(String[] args) {
        int i = Integer.parseInt("100");
        System.out.println("i = " + i);

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(100);
        list.add(new Integer(100)); // Unnecessary boxing 'new Integer(100)', 'Integer(int)' is deprecated 경고 --> 앞으로 사용안한다고 경고
        list.add(Integer.valueOf("100")); // valueOf 사용 권장

    }


}
