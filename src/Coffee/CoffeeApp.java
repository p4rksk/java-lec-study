package Coffee;

public class CoffeeApp {
    public static void main(String[] args) { //
        Barista B = new Barista();
        Customer customer = new Customer(B);


        customer.order("아메리카노");

    }
}
