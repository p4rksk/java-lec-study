package ex04;

class Pizza{ //Pizza에 대한 설계도
    int size;
    String type;

    public Pizza(){ //매개 변수가 없는 생성자
        size = 12;
        type = "슈퍼스프림";
    }

    public Pizza(int s, String t){ // 매개 변수가 있는 생성자
        size = s;
        type = t;
    }
}


public class PizzaTest {
    public static void main(String[] args) {
        Pizza obj1 = new Pizza();
        System.out.println("(" + obj1.type + " , " + obj1.size + ",)");

        Pizza obj2 = new Pizza(24, "포테이토");
        System.out.println("(" + obj2.type + " , " + obj2.size + ",)");
    }
}
