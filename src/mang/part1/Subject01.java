package mang.part1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Subject01 {
    public static void main(String[] args) {

        // Stream 사용 전
        String[] nameArr = {"IronMan", "Captain", "Hulk", "Thor"};
        List<String> nameList = Arrays.asList(nameArr);

        // 원본의 데이터가 정렬됨
        Arrays.sort(nameArr);
        Collections.sort(nameList);

        for(String str : nameArr) {
            System.out.println(str);
        }

        for(String str : nameList) {
            System.out.println(str);
        }
        // 위 Stream 을 사용하지 않는 경우도 나쁜 경우는 아니지만 가독성이 떨어지고 원본을 손상시킨다는 단점을 가지는 코드

    }
}
