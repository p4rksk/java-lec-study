package ex04.test;

import ex04.DeskLamp;

public class DeskLampTest {
    public static void main(String[] args) {
        // 객체를 생성하려면 new 예약어를 사용한다.
        DeskLamp myLamp = new DeskLamp();

        //객체의 메소드를 호출하려면 도트 연산자인 .을 사용한다.
        myLamp.turnOn();
        System.out.println(myLamp);
        myLamp.turnOff();
        System.out.println(myLamp);
    }

}
