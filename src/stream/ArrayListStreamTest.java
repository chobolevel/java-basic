package stream;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {
    public static void main(String[] args) {

        List<String> sList = new ArrayList<>();
        sList.add("Tomas");
        sList.add("Edward");
        sList.add("Jack");

        Stream<String> stream = sList.stream();
        stream.forEach(s -> System.out.println(s + " "));
        System.out.println();

        // sorted 는 기본적으로 오름차순으로 정렬되고 Comparable 인터페이스를 구현해서 정렬을 커스텀할 수 있음
        sList.stream().sorted().forEach(s -> System.out.println(s));

    }
}
