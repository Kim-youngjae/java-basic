package javajungsuk.youtube;

import java.util.ArrayList;
import java.util.zip.Adler32;

public class GenericsEx1 {
    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
        ArrayList<Tv> list = new ArrayList<Tv>();

        list.add(new Tv());
//        list.add(new Audio());

//        Tv t = (Tv) list.get(0); // 지네릭이 없었을 때는 Tv로 형변환을 해주었어야 한다.
        Tv t = list.get(0);
    }
}

//class Tv{}
//class Audio {}


