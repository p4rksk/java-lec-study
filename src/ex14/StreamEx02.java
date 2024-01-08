package ex14;

import java.util.Arrays;
import java.util.List;

class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void chanageAge(){ //클레스는 맵이랑 다르게 메서드가 넣을 수 있어서 코드가 간편해짐
        this.age = this.age -1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class StreamEx02 {
    public static void main(String[] args) {
        // User 3명 만들기 (홍길동 20, 장보고 15, 임꺽정 30)
        User u1 = new User("홍길동", 20);
        User u2 = new User("장보고", 15);
        User u3 = new User("임꺽정", 30);

        // ArrayList에 User 담기
        List<User> arr = Arrays.asList(u1, u2, u3);

        // stream으로 순회하면서 map으로 가공하기 ( 나이 -1 )
        List<User> newArr = arr.stream().map(u -> {
            u.chanageAge();//클래스로 만들어서 메소드를 호출하여 코드가 단순해진다.
            return u;
        }).toList();

        newArr.stream().forEach(user -> {
            System.out.println(user.getAge());
        });
    }
}