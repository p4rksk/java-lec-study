package ex03;

import java.util.Scanner;
    public class GugudanEx01 {
        public static void main(String[] args) {

            //2~9단까지 출력되는 프로그램을 만드시오.
            for(int x=2; x<=9; x++){
                for (int i = 1; i <=9 ; i++) {
                     System.out.print(x + "*" + i + "=" + (x * i) + "\n");


                    }
                }
            //스캐너를 이용하여 입력받은 단만 출력하시오.
            System.out.print("출력하고 싶은 구구단의 단을 골라주세요: ");
            Scanner sc = new Scanner(System.in);
            int selectedNum = sc.nextInt();
            for (int i = 1; i <= 9; i++) {
                System.out.println(selectedNum + "*" + i + "=" + (selectedNum * i));
            }
        }
    }
