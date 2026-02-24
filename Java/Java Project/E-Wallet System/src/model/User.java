package model;

public class User {
    private int userId;
    private String name;
    private String mobile;

    public User(int userId, String name, String mobile) {
        this.userId = userId;
        this.name = name;
        this.mobile = mobile;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getMobile() {
        return mobile;
    }
}
