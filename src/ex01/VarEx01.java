package ex01;

import javax.naming.ldap.SortControl;

public class VarEx01 {

    // 모든 코드는 main 메서드 내부에 적는다.(os가 찾아줌)
    public static void main(String[] args) {
            int n1 = 1; // int:21억까지 들어간다.(4byte)
            double d1 = 1.5;// 숫자 범위는 21억까지지만 .뒤에 숫자가 더 있다.(8byte)
            long big1 = 20000000000L; // 경까지 (8byte) (숫자 범위를 넘어서 저장하려하면 L을 붙여 쓴다.)
            boolean b1 = true; // true, false (1bit)
            char c1 = '가';

        System.out.println(n1);
        System.out.println(d1);
        System.out.println(big1);
        System.out.println(b1);
        System.out.println(c1);
    } // java 프로그램 종료
}
