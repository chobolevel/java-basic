package modernjavainaction.chap02;

public class Apple {

    private AppleColor color;
    private int weight;

    public Apple(AppleColor color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public AppleColor getColor() {
        return color;
    }

    public void setColor(AppleColor color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
