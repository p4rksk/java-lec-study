package ex03;

import java.util.Scanner;



//2~9단까지 출력되는 프로그램을 만드시오.
    //스캐너를 이용하여 입력받은 단만 출력하시오.
    public class GugudanEx01 {
        public static void main(String[] args) {
           //2단  // \t는 탭, \n은 엔터

            for(int x=2; x<=9; x++){
                for (int i = 1; i <=9 ; i++) {
                     System.out.print(x + "*" + i + "=" + (x * i) + "\t");

                     //미완성

                    }
                }
        }
    }
