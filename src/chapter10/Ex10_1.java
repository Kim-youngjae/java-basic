package chapter10;

import java.util.Calendar;

public class Ex10_1 {
    public static void main(String[] args) {
        // Calendar 클래스 실습
        // 기본적으로 현재 날짜와 시간이 세팅된다
        Calendar cal = Calendar.getInstance(); //추상클래스이기 때문에 객체 생성 x -> .getInstance()로 객체를 호출해야함
        System.out.println(cal);
        System.out.println("이 해의 년도: " + cal.get(Calendar.YEAR));
        System.out.println("월(0~11 0:1월: " + cal.get(Calendar.MONTH));
        System.out.println("이 해의 몇째 주 인지: " + cal.get(Calendar.WEEK_OF_YEAR));
        System.out.println("이 달의 몇째 주 인지: " + cal.get(Calendar.WEEK_OF_MONTH));

        // DATE == DAY_OF_MONTH
        System.out.println("이 달의 몇일: " + cal.get(Calendar.DATE));
        System.out.println("이 달의 몇일: " + cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("이 해의 몇일: " + cal.get(Calendar.DAY_OF_YEAR));
        System.out.println("요일을 반환(1~7) 1:일요일: " + cal.get(Calendar.DAY_OF_WEEK));
        System.out.println("요일을 반환(1~7) 1:일요일 (2): " + Calendar.DAY_OF_WEEK); // 위와 같은 값을 반환할까? 다름 cal의 현재의 정보에서 오늘의 요일을 반환
        // 그냥 Calendar.DAY_OF_WEEK 는 전체 값인 7을 반환
        System.out.println("이 달의 몇번째 요일: " + cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println("오전인지(0) 오후인지(1): " + cal.get(Calendar.AM_PM));
        System.out.println("TimeZone(-12 ~ 12) : " + (cal.get(Calendar.ZONE_OFFSET) / (60*60*1000)));
        System.out.println("이달의 마지막 일: " + cal.getActualMaximum(Calendar.DATE));

    }
}
