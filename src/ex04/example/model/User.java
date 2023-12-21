package ex04.example.model;

public class User {
    //모든 User는 고유번호가 필요함.
    final int id;
    String name;
    String email;

    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
}
