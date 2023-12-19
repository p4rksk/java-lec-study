package ex04;

// add, minus, divide, multi
public class CarculatorApp {
    public static void main(String[] args) {
        Calculator cal = new Calculator(); // Calculator의
        int result = cal.add(50,80);
        System.out.println("add : " + result);

        int a = cal.minus(80,50);
        System.out.println("minus : " + a);

        int b = cal.divide(80,50);
        System.out.println("divide : " + b);

        int c = cal.multi(50,80);
        System.out.println("multi : " + c);



    }
}
