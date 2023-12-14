package ex03;

import java.util.Scanner;

public class Averagger {
    public static void main(String[] args) {
        int total=0;
        int count=0;
        Scanner sc =new Scanner(System.in);

        while(true){
            System.out.println("점수를 입력하시오: ");
            int a = sc.nextInt();
            if (a <0) break;

            total += a;
            count++;
            }
        System.out.println("평군은" + total / count);
    }
}
