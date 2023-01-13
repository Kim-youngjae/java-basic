package array;

public class ArrayWithFor {
    public static void main(String[] args) {
        int[] iarray = new int[100]; // 100개를 담을 배열

        iarray[0] = 1;
        iarray[1] = 2;

        for (int i = 0; i < iarray.length; i++) {
            iarray[i] = i + 1;
        }

        int sum = 0;
        for (int i = 0; i < iarray.length; i++) {
            sum += i + 1;
        }
        System.out.println(sum);


    }
}
