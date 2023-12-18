package ex02.test;

import java.util.Scanner;

public class Programing02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double i = 1.609;
        double x ;
        System.out.print("마일을 입력하세요 : " );
        x  = sc.nextDouble();

        double y = x* i;

        System.out.println(x + "마일은" + y + "킬로 미터 입니다.");





    }
}
