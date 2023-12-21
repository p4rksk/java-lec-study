package ex05;

public class PizzaaTest {
    public static void main(String[] args) {
        Pizzaa p1 = new Pizzaa("Super Supreme");
        Pizzaa p2 = new Pizzaa("chese");
        Pizzaa p3 = new Pizzaa("Pepperoni");
        int n = Pizzaa.count;
        System.out.println("지금까지 판매된 피자 개수 =" +n);
    }
}
