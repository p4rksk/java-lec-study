package ex03.Programing;

import java.util.Scanner;

public class Programing03 {
    public static void main(String[] args) {

        //1부터 50까지 와 1부터 50까지 숫자 중에 3의 배수는 "짝"을 담을 배열 만들기
        String [] gugudan = new String [50];

        //배열에 1부터 50까지 담기 및 3의 배수 일때는 짝으로 출력하기.
        for(int i = 0 ; i<50; i++ ){
            gugudan[i] = String.valueOf(i+1);//숫자들을 문자들로 바꿔주기
            if(gugudan[i].contains("3")||gugudan[i].contains("6")||gugudan[i].contains("9")){
                gugudan[i]="짝";
            }
            System.out.print(gugudan[i]+" ");
        }
        }




        }




