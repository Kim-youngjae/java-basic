package javajungsuk.youtube;
import java.util.*;

class HashMapEx1 {
    public static void main(String[] args) {
        HashMap map = new HashMap(); // HashMap선언
//        HashMap map = new HashMap(int initCapacity); // HashMap선언
//        HashMap map = new HashMap(int initCapacity, float loadFactor(일정 용량이 되면 두배로 용량을 늘려 생성)); // HashMap선언
//        HashMap map = new Map(Map, m); // Map에 저장된 모든 요소를 포함하는 HashMap 생성
        map.put("myId", "1234");
        map.put("asdf", "1111");
        map.put("asdf", "1234"); // 기존 1111의 값에 1234를 덮어 쓴다.

        Scanner s = new Scanner(System.in);	// 화면으로부터 라인단위로 입력받는다.

        while(true) {
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id :");
            String id = s.nextLine().trim(); // trim() 공백을 제거

            System.out.print("password :");
            String password = s.nextLine().trim();
            System.out.println();

            if(!map.containsKey(id)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
                continue;
            } else {
                if(!(map.get(id)).equals(password)) { // map.get(id) --> map안에 id의 키와 일치하는 값을(value를)반환한다.
                    System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
                } else {
                    System.out.println("id와 비밀번호가 일치합니다.");
                    break;
                }
            }
        } // while
    } // main의 끝
}