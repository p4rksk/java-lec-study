package ex04;

public class MethodEx01 {

    static void m1(){
        System.out.println("m1");
    }

    static String m2(){
        System.out.println("m2"); // return 전에 입력해야 한다.
        return "m2"; //메서드 종료
    }

    public static void main(String[] args) {
        m1();// static은 클래스 명으로 찾는데 클래스 명을 생략 할 수 있다.
        m2();// 호출이 되는 순간 (m2 내부)10번 11번이 메모리에 열린다. = 메서드가 호출이 되는 순간 호출문으로 바뀐다.
        String result =m2();//실행이 끝나면 리턴값으로 바뀐다.
        System.out.println("result :" + result);

    }
}
