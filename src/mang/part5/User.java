package mang.part5;

public class User {

    private String name;
    private String hobby;
    private String intro;

    public User(String name, String hobby, String intro) {
        this.name = name;
        this.hobby = hobby;
        this.intro = intro;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }
}
