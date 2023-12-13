package ex02;

import java.util.Scanner;

public class Ftoc2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("섭씨(표준 c) 온도를 입력하세요:");

        // 1. 섭씨 온도 받기
        double temp = sc.nextDouble();
        //System.out.println(c);


        // 2. 섭씨 -> 화씨 온도로 변환
        double result = 9.0/5.0 * temp + 32;
        System.out.println(result);
    }
}

