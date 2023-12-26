package ex06;

abstract class Shape1{
    int x,y;
    public void translate(int x, int y){
        this.x = x;
        this. y = y;
    }
    public abstract void draw();
};

class Rectangle extends Shape1{
    int width, height;
    public void draw(){
        System.out.println("사각형 그리기 메소드");
    }
};

class Circle1 extends Shape1{
    int width, height;
    public void draw(){
        System.out.println("원 그리기 메소드");
    }
};

public class Abstract {
    public static void main(String[] args) {
        Shape1 s2 = new Circle1();
        s2.draw();
    }
};
