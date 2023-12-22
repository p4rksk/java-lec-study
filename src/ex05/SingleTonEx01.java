package ex05;

class President{
    String name;

    static President instance = new President();

    private President(){}
}

public class SingleTonEx01 {
    public static void main(String[] args) {
        President p1 = President.instance;
        President p2 = President.instance;
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
    }
}
