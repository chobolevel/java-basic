package modernjavainaction.chap02;

public enum AppleColor {
    RED("빨간색"),
    GREEN("초록색");

    private final String name;

    AppleColor(String name) {
        this.name = name;
    }

    public String getCode() {
        return name();
    }

    public String getName() {
        return name;
    }
}
