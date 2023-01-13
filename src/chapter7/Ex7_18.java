package chapter7;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.EventHandler;

public class Ex7_18 {
    public static void main(String[] args) {
        Button b = new Button("start");
//        b.addActionListener(new EventHandler()); // EventHandler라는 객체를 생성해주어도 되지만
        b.addActionListener(new ActionListener() { // 2. 여기서는 인터페이스이므로 구현 인터페이스이름을 사용
            @Override
            public void actionPerformed(ActionEvent e) { // 3.그리고 원래 EventHandler객체 안에 있던 사용할 메서드를 정의
                System.out.println("ActionEvent occurred!!!");
            }
        });
    }
}

//class EventHandler implements ActionListener { // 1. 익명 클래스는 이름이 없으므로 구현인터페이스나 조상클래스의 이름을 사용
//    public void actionPerformed(ActionEvent event) {
//        System.out.println("ActionEvent occurred!!!");
//    }
//}