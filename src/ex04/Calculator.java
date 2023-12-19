package ex04;

//계산기 클래스 = 설계도
public class Calculator {

    public int add(int n1, int n2){ //static이 안붙어 있으면 static이 아님.
        return n1+n2;


    }
    public int minus(int n1, int n2){ //메서드 안에 메서드 생성 불가능,  자바는 클래스 메서드를 만들어야 된다.
        return n1-n2;

    }
    public int divide(int n1, int n2){
        return n1/n2;

    }
    public int multi(int n1, int n2){
        return n1*n2;

    }

}
