package ex06.example;

import ex06.example.model.Account;

// 트랜 잭션 관리 (일의 최소 단위)
public class BankService {
    public static void 출금(Account withdrowAccount, long amount){
        if (amount <=0) {
            System.out.println("0원 이하 금액을 이체할 수 없습니다.");
            return;
        }
        if (withdrowAccount.잔액부족하니(amount)){
            System.out.println("잔액이 부족합니다.");
            return;
        }
        withdrowAccount.출금(amount);
    }
    public static void 이체(Account senderAccount, Account receiverAcount, long amount){
        if (amount <=0) {
            System.out.println("0원 이하 금액을 이체할 수 없습니다.");
            return;
        }
        if (senderAccount.잔액부족하니(amount)){
            System.out.println("잔액이 부족합니다.");
            return;
        }


        senderAccount.출금(amount);
        receiverAcount.입금(amount);
    }
}
