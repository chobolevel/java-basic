package modernjavainaction.chap03;

public class LambdaSyntax {
    public static void main(String[] args) {

//         QUIZ 1) 람다 작성 규칙에 맞지 않는 것을 고르시오
//         1) () -> {}
//         2) () -> "Raoul"
//         3) () -> { return "Mario" }
//         4) (Integer i) -> return "Alan" + i;
//         5) (String s) -> { "Iron Man" }
//         result -> 4, 5

//        QUIZ 2) 다음 중 함수형 인터페이스인 것을 고르시오
//        public interface Adder {
//            int add(int a, int b)
//        }
//
//        public interface SmartAdder extends Adder {
//            int add(double a, double b);
//        }
//
//        public interface Nothing {
//
//        }
//         result -> Adder

//        QUIZ 3) 람다를 사용할 수 있는 코드는?
//        execute(() -> {})
//        public void execute(Runnable r) {
//            r.run();
//        }
//
//        public Callable<String> fetch() {
//            return () -> "Tricky example ;-)";
//        }
//
//        Predicate<Apple> p (Apple a) -> a.geWeight();
//        result -> 1, 2

    }
}
