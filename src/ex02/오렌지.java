package ex02;

import java.util.Scanner;

public class 오렌지 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);


        int orangebox = 10;

        System.out.print("오렌지의 개수를 입력하시오 : " );
        int x = sc.nextInt();

        System.out.println(x/orangebox + "박스가 필요하고" + x%orangebox+"개가 남습니다." );





    }
}
