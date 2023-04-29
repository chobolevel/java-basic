package modernjavainaction.chap02;

public class AppleSimpleFormatter implements AppleFormatter{
    @Override
    public String format(Apple apple) {
        return "An apple of " + apple.getWeight() + "g";
    }
}
