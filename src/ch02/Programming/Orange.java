package ch02.Programming;

import java.util.Scanner;

public class Orange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int box= 10; // 오렌지 박스
        int orange; //오렌지 갯수
        int sum;
        int a;
        System.out.print("오렌지의 갯수를 입력하시오: ");
        orange = sc.nextInt();

        a = orange/box;
        sum = orange%box;
        System.out.println(a +"박스가 필요하고 "+sum+"개가 남습니다.");




    }



}
