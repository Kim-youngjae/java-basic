package javajungsuk.youtube;

import java.util.*;

class HashMapEx4 {
    public static void main(String[] args) {
        String[] data = { "A","K","A","K","D","K","A","K","K","K","Z","D" };

        HashMap map = new HashMap();

        for(int i=0; i < data.length; i++) { // 데이터 길이만큼 반복하면서
            if(map.containsKey(data[i])) { // 동일한 key가 있으면
                Integer value = (Integer)map.get(data[i]); // 그 key의 value를 가져와서
                map.put(data[i], new Integer(value.intValue() + 1)); // key과 value에 1을 더한 값을 다시 저장
            } else {
                map.put(data[i], new Integer(1)); // 없는 key이면 1을 저장
            }
        }

        Iterator it = map.entrySet().iterator();

        while(it.hasNext()) {
            Map.Entry entry = (Map.Entry)it.next();
            int value = ((Integer)entry.getValue()).intValue();
            System.out.println(entry.getKey() + " : " + printBar('#', value) + " " + value );
        }
    } // main

    public static String printBar(char ch, int value) {
        char[] bar = new char[value];

        for(int i=0; i < bar.length; i++) {
            bar[i] = ch;
        }

        return new String(bar); 	// String(char[] chArr)
    }
}