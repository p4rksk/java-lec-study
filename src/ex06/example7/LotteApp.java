package ex06.example7;

public class LotteApp {
    public static void main(String[] args) {
        Burger b1 = new Burger("기본버거",1000);
        Burger b2 = new ShrimpBurger("새우버거",2000,"새우");
        Coke c1 = new Coke("콜라",1000);
        System.out.println();
        BuggerSet set1 = new BuggerSet(new Burger("기본 버거",1000),
        new Coke("콜라",1000));
        System.out.println(set1.getBurger().getPrice());
        System.out.println("총 가격은: ");
    }
}
