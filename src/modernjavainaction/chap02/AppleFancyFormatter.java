package modernjavainaction.chap02;

public class AppleFancyFormatter implements AppleFormatter{
    @Override
    public String format(Apple apple) {
        String characteristic = apple.getWeight() > 150 ? "heavy" : "light";
        return "A " + characteristic + " " + apple.getColor().getCode() + " apple";
    }
}
