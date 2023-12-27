package ex06.example7;

public class BuggerSet { // has Burger, Coke    컴포지션 코드: 상속이 아닌 잘만들어진 코드를 사용하고 싶을 때
    private Burger burger;
    private Coke coke;

    public BuggerSet(Burger burger, Coke coke) {
        this.burger = burger;
        this.coke = coke;
        System.out.println("버거 세트가 만들어졌어요");
    }

    public int getTotalPrice(){
        return burger.getPrice() + coke.getPrice();
    }

    public Burger getBurger() {
        return burger;
    }

    public Coke getCoke() {
        return coke;
    }
}
