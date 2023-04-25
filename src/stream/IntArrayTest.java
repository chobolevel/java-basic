package stream;

import java.util.Arrays;

public class IntArrayTest {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        int sumVal = Arrays.stream(arr).sum();
        // 반환값이 long 이기 때문에 int 형으로 변환 필요
        int count = (int) Arrays.stream(arr).count();

        System.out.println(sumVal);
        System.out.println(count);

    }
}
