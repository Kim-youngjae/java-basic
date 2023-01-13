package arrays_practice;

import java.util.Arrays;

public class ArraysExam {


    public static void main(String[] args) {
        int[] arr1 = {0, 1, 2, 3, 4};
        int[] arr2 = Arrays.copyOf(arr1, arr1.length); //두 번째 파라미터: 복사할 요소의 개수 [0,1,2,3,4]
        int[] arr3 = Arrays.copyOf(arr1, 3); // [0,1,2]
        int[] arr4 = Arrays.copyOf(arr1, 7); // [0,1,2,3,4,0,0] 0~6 번까지 빈자리는 0으로 채움
        int[] arr5 = Arrays.copyOfRange(arr1, 2, 4); //[2,3] to의 4가 4번째가 아닌 그 앞까지



        String[][] str2D = {{"aaa", "bbb"}, {"AAA", "BBB"}};
        String[][] str2D2 = {{"aaa", "bbb"}, {"AAA", "BBB"}};

        // 2차원 배열 비교할 때에 등가연산자는 사용못함 for문으로 모든 요소를 비교하는 것은 가능
//        System.out.println(str2D == str2D2);
        /**
         * 위는 참조변수 값을 비교하는 것
         * 서로 다른 배열이기 때문에 당연히 같을 수가 없다.
         * 비어있는 공간에 배열을 만들기 떄문에
         */

        System.out.println(Arrays.deepEquals(str2D, str2D2));

    }
}
