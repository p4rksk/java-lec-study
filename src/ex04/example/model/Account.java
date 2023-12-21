package ex04.example.model;


//객체의 상태를 변경, 객체의 상태를 확인
public class Account {
    private final int id;
    private  long balance; // 추후에 금액이 변경 될거기 때문에 메소드가필요
    private  int  userId; //java는 카멜 표기법

    public boolean 잔액부족하니(long amount){
        if (balance < amount){
            return true;
        }
            return false;
    }

    //메서드는 하나의 책임만 가지는게 좋다.(예외도 있음)
    public void 출금(long amount){
        this.balance = this.balance - amount;

    }
    public void 입금(long amount){
        this.balance = this.balance + amount;

    }


    public Account(int id, long balance, int userId) {
        this.id = id;
        this.balance = balance;
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", userId=" + userId +
                '}';
    }
}
