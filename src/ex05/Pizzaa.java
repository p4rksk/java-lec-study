package ex05;

public class Pizzaa{
    private String toppings;
    private int radius;
    private final double PI =3.141592;
    static int count =0;

    public Pizzaa(String toppings){
        this.toppings = toppings;
        count++;

    }
}


