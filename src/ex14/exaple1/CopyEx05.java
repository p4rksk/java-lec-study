package ex14.exaple1;

import java.time.LocalDate;
import java.time.LocalDateTime;

//Data Transfer Object
class JoinDTO{ // 사용자로 받는 데이터
    private String username; // id=username
    private String password;
    private String email;

    public JoinDTO(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }
}

class Member {
    private int no;  // 우리가 만들어야 되는 데이터
    private String username;
    private String password;
    private String email;
    private LocalDateTime createdAT; //서버가 만든다.

    public Member(int no, JoinDTO dto) {
        this.no = no;
        this.username =
        this.password = password;
        this.email = email;
        this.createdAT = createdAT;
    }
}

public class CopyEx05 {
    public static void main(String[] args) {
        JoinDTO d1 = new JoinDTO("ssar","1234","ssar@nate.com");
        JoinDTO d2 = new JoinDTO("cos","1234","cos@nate.com");

        // 객체 복사 하기
        Member m1 = new Member(1, d1);
        Member m2 = new Member(2, d2);


//        LocalDateTime now = LocalDateTime.now(); //os 시간에 맞춰준다.
//        System.out.println(now);  //T는 날 짜와 시간을 나누는 기준점
    }
}
