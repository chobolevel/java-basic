package defaultMethod;

public interface Vehicle {
    default void print(String str) {
        System.out.println("I want to " + str);
    }
}
