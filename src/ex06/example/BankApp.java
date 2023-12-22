package ex06.example;

import ex06.example.model.Account;
import ex06.example.model.User;

public class BankApp {
    public static void main(String[] args) {
        //1. 고객 2명 만들기
        User dd =new User(1,"dd","dd@naver.com");
        User ee =new User(2,"ee","ee@naver.com");
        User love =new User(3,"love","love@naver.com");
        //2. 계좌 2개 만들기
        Account ddAccount = new Account(1111,1000l,1);
        Account eeAccount = new Account(2222,1000l,2);
        Account loveAccount = new Account(3333,1000l,2);
        //3. 고객에게 정보를 받기 (sender, reciver, amount)
        long amount = 100l;


        //4. 이체 (dd -> ee 100원)
        BankService.이체(ddAccount,eeAccount,amount);

        //5. 이체 (ssar -> love 100원)
        BankService.이체(ddAccount,loveAccount,amount);

        //6. 이체 (ee -> love 100원)
        BankService.이체(eeAccount,loveAccount,amount);

        //7. 객체 상태 확인
        System.out.println(ddAccount);
        System.out.println(eeAccount);
        System.out.println(loveAccount);

        //8. 출금
        BankService.출금(ddAccount,amount);





    }
}
