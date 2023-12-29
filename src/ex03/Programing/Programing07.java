package ex03.Programing;
/*
2와 100 사이에 있는 모든 소수 (Prime number)를 찾는 프로그램을 작성하라.
주어진 정수 k를 2부터 k-1까지의 숫자로 나누어서 나머지가 0인 것이 하나라도 있으면 소수가 아니다.
-----출력문------
2부터 100사이의 모든 소수 : 2 3 5 7 11 13 ...
 */
public class Programing07 {
    public static void main(String[] args) {
        for (int i=2; i <=100; i++){
            boolean x = true;
            //System.out.println(x);
            for (int j = 2; j<i; j++){
                if (i%j == 0){
                    x = false;
                    break;
                }
            }
            if (x){
                System.out.println(i+" ");
            }

            }
        }
    }





