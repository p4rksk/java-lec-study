package ch02.Programming;

import java.util.Scanner;

public class distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = 1.609;
        double y;
        double b;

        System.out.print("마일을 입력하세요: ");
        y = sc.nextDouble();

        b = y/a;
        System.out.println(y+"마일은 "+b+"킬로미터입니다.");
    }
}
