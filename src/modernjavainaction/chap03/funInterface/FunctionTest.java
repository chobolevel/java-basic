package modernjavainaction.chap03.funInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionTest {

    public static <T, R> List<R> map(List<T> list, Function<T, R> f) {
        List<R> results = new ArrayList<>();
        for(T t : list) {
            results.add(f.apply(t));
        }
        return results;
    }

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("apple", "banana", "lemon", "pineapple");
        List<Integer> map = map(stringList, (String s) -> s.length());
        System.out.println("map: " + map);

    }

}
