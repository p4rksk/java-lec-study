package ex04.example.model;

public class Account { //계좌
    public final int id; //계좌 번호 (숫자 4자리로 구성 되 있다)  new가 될때 초기화 되는 코드가 있어야됨(문법)
    public long balance;
    public int userId;

    public Account(int id, long blance, int userId) {
        this.id = id;
        this.balance = blance;
        this.userId = userId;
    }

    @Override
    public String toString() { // 객채 내부에 값을 볼때 toString 사용
        return "Acoount{" +
                "id=" + id +
                ", balance=" + balance +
                ", userId=" + userId +
                '}';
    }
}
