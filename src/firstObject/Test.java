package firstObject;

import java.util.function.Consumer;

public class Test {

    public static void print(Consumer<String> c, String str) {
        c.accept(str);
    }

    public static Consumer<String> hello() {
        return (t) -> System.out.println(t);
    }

    public static void main(String[] args) {

        // 일급 객체 조건

        // 1) 변수나 데이터에 담을 수 있어야 한다
        Consumer<String> c = (s) -> System.out.println(s);
        c.accept("Hello World");

        // 2) 함수의 파라미터로 전달할 수 있어야 한다
        print((t) -> System.out.println(t), "Hello World");

        // 3) 함수의 리턴값으로 사용할 수 있어야 한다
        Consumer<String> hello = hello();
        hello.accept("Hello World");

    }

}
