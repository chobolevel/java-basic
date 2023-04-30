package modernjavainaction.chap03.methodRef;

public class Test {

//    다음의 람다 표현식과 일치하는 메서드 참조
//    1) ToIntFunction<String> stringToInt = (String s) -> Integer.parseInt(s);
//    result -> ToIntFunction<String> stringToInt = (String s) -> Integer::parseInt;

//    2) BiPredicate<List<String> String> contains = (list, element) -> list.contains(element);
//    BiPredicate<List<String> String> contains = (list, element) -> List::contains;

//    3) Predicate<string> startsWithNumber = (String s) -> this.startsWithNumber(string);
//    Predicate<String> startsWithNumber = (String s) -> this::startsWithNumber

}
