package test;

import java.util.Optional;
import java.util.function.Consumer;

public class Test {

    public static void print(Consumer<String> c, String str) {
        c.accept(str);
    }

    public static void main(String[] args) {
        print((s) -> System.out.println(s), "Hello World!");
    }

}
