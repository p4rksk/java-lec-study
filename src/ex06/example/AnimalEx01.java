package ex06.example;

class Animal{

    void speak(){
        System.out.println("멍멍");
    }
    void Run(){
        System.out.println("달린다");
    }
}

class Cat extends Animal{

    void speak() { //재정의 상속 할 멤버의 내용을 상속 받는
        System.out.println("야옹");

    }
}




public class AnimalEx01 {
    public static void main(String[] args) {
    Animal c1 = new Cat(); //[Cat, Animal]
    c1.speak();
    c1.Run();
    }
}
