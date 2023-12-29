package ex03.Programing;

import java.util.Scanner;

public class Programing01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x;
        String [] Eng = {"ONE", "Two", "three", "four", "five", "six", "seven", "eight", "nine"};
        //정수를 입력하세요 만들기
        System.out.print("정수를 입력하세요: ");
        x=sc.nextInt();

        //1,2......9이면 "영어로 1부터 각 해당하는 숫자를 출력하게 만들기"
        if(x>=1 && x<=9){
            System.out.println(Eng[x-1]);

        }else {
            System.out.println("Other");
        }


    }
}
