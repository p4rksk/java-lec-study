package ex03.Programing;

public class Programing04 {
    public static void main(String[] args) {
            int a3 = 0;
            int a4 = 0;

            //3의 배수
            for (int i = 1 ; i<=100; i++){
                if(i%3==0){
                    a3=a3+i;
                 //   System.out.println(a3);
                }
            }

            //4의 배수
            for (int i = 1 ; i<=100; i++){
                if(i%4==0){
                    a4=a4+i;
              //      System.out.println(a4);
                }
            }

            //두 숫자의 배수의 합
        int total = a3 + a4;
        System.out.println("1부터 100 사이의 3의 배수와 4의 배수의 합: "+ total);
        }




        }




