package ex04.test;

public class ScopeEx01 {

    int n1 = 1;// heap에 저장
    static int n2= 2;// static에 저장

    static void m1(){//메서드 내에 만들어지는 변수를 지역변수
        int n5 = 10; // m1 메서드를 호출해야지 m1내부인 n1의 값이 뜸 stack에 저장
        System.out.println("m1 : " + n5);
    }

    void m2(){
        System.out.println("m2 : " + n1);

    }
    //메인 시작전에 static에 m1 메소드와 n2 변수가 로드 되어 있음.
    public static void main(String[] args) {
        System.out.println(1);
        m1(); // static은 메인 안에서 한번 밖에 호출이 안됨.
        System.out.println(2);
        ScopeEx01 sc =new ScopeEx01();
        System.out.println(sc.n1);
        sc.m2();
    }
}
