package modernjavainaction.chap03.funInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {

    public static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> results = new ArrayList<>();
        for(T t : list) {
            if(p.test(t)) {
                results.add(t);
            }
        }
        return results;
    }

    public static void main(String[] args) {

        Predicate<String> nonEmptyStringPredicate = (String s) -> !s.isEmpty();

        List<String> listOfStrings = Arrays.asList("a", "b", "c", "d", "e");
        List<String> nonEmpty = filter(listOfStrings, nonEmptyStringPredicate);
        System.out.println("results: " + nonEmpty);

    }
}
