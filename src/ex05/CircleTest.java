package ex05;

class Shape {
    int x,y;

    public Shape(){
        System.out.println("Shape 생성됨");
    }
}

class Circle extends Shape{
    int radius;//반지름

    public Circle(int radius) {
        System.out.println("Circle 생성됨");
        this.radius = radius;
        System.out.println("1");
        super.x = 0;  /// 부모 shpae의 멤버를 자식 메서드에서 사용하려면 super.을 붙이고 멤버를 입력하기.
        super.y = 0;
    }
    double getArea(){
        return 3.14 * radius * radius;
    }
}

public class CircleTest {
    public static void main(String[] args) { //부모의 디폴트 생성자가 먼저 출력됨.
        Circle circle = new Circle(10);
    }
}
