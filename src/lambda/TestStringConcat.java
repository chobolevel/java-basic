package lambda;

public class TestStringConcat {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "world";

        System.out.println("##### class instance #####");
        StringConcatImpl concat1 = new StringConcatImpl();
        concat1.makeString(s1, s2);

        System.out.println("##### functional interface ######");
        StringConcat concat2 = (s, v) -> System.out.println(s + ", " + v);
        concat2.makeString(s1, s2);

    }
}
