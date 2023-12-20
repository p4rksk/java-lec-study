package ex04;


class People{ // 설계도
    String name;
    int power;
    int hp;

    //객체 초기화
    public People(String name, int power) { // ALT+INSERT
        this.name = name; //this는 무조건 heap꺼
        this.power = power;
        this.hp = 100;
    }

    //행위
    public void upgradePower(){
        this.power++;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", hp=" + hp +
                '}';
    }
}

public class PeopleEx01 {
    public static void main(String[] args) {
        People p1 = new People("티모",10);

        p1.upgradePower();
        System.out.println(p1);


    }
}
