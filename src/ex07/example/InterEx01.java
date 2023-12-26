package ex07.example;

interface Remocon {//객체가 아니다. 그래서 new도 못함
    void on();// public abstract 생략가능

    void off();
}

class SamsungRemocon implements Remocon {

    @Override
    public void on() {
        System.out.println("삼성 리모컨 on");
    }

    @Override
    public void off() {
        System.out.println("삼성 리모컨 off");
    }
}

class LgRemocon implements Remocon {

    @Override
    public void on() {
        System.out.println("엘지 리모컨 on");
    }

    @Override
    public void off() {

    }
}

/**
 * 작성자 : 홍길동
 * 날짜 : 2023.12.26
 * 구현체 : samsungRemocon, lgRemocon
 */
class CommonRemocon{
    //p
   private Remocon r;//인터페이스 or 추상클래스

    public CommonRemocon(Remocon r) {
        this.r = r;
    }

    public void on(){
        r.on();
    }

    public void off(){
        r.off();
    }
}

public class InterEx01 {

    public static void main(String[] args) {
       CommonRemocon cr = new CommonRemocon(new SamsungRemocon());
       cr.on();
    }
}