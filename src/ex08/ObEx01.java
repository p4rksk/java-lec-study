package ex08;

class Account extends Object {
    private String author;
    private int number;
    private int balance;

    public Account(String author, int number, int balance) {
        this.author = author;
        this.number = number;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "author='" + author + '\'' +
                ", number=" + number +
                ", balance=" + balance +
                '}';
    }
}

public class ObEx01 {
    public static void main(String[] args) {
        Account account = new Account("홍길동", 1111, 1000);
        Account account2 = new Account("홍길동", 1111, 1000);
        System.out.println(account);
        System.out.println(account.toString());
        System.out.println(account.getClass());
        System.out.println(account.hashCode());

        if (account == account2){ // ==은 값(기본 자료형)이나 메모리 주소를 비교하는거다. (둘의 해쉬 코드가 다름)-
            System.out.println("ㅋ");
        }

        //account -> equals() (오브젝트) (주소비교)
        //account.toString -> equals() (첫번째로 주소비교 주소가 다를때는 값을 비교)
        //객체의 상태값을 비교 할때
        if (account.toString().equals(account2.toString())){
            System.out.println("같아요");
        }
    }
}