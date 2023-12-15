package ex03;

import java.util.Scanner;
public class Score {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 59;
        int user;
        int count;

        while (true) {
            System.out.print("정답을 추측하여 보시오 : ");
            user = sc.nextInt();

            if (user < answer) {
                System.out.println("제시한 정수가 낮습니다.");




                }else if (user == 59) {
                System.out.print("축하합니다. \t 시도횟수=");
                break;

            }

            }
        }
    }


