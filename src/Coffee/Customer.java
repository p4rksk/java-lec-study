package Coffee;

//Customer가 Barista에 의존한다. 의존적인 관계는 생성자를 넘겨주는게 가능한다.
public class Customer {

    private Barista B;

    public Customer(Barista B){
        this.B = B;
    }

    public void order(String menuName){
        Coffee coffee = B.makeCoffee();
        System.out.println(coffee.name + "을 받았습니다/");

    }
}
