package ex03.test;

public class BublleTest02 {
    public static void main(String[] args) {
        int [] arr = {5, 8, 2, 4, 3};

        final int N = arr.length; // final은 대문자다.


        //두번째 도전 4바퀴 도는데, 1회전때 4바퀴 도는 내부 포문 만득ㄹ기
        for (int i = 0; i < N - 1; i++) {

            for (int j = 0; j < N - i - 1; j++) {
                System.out.println("몇 바 뀌 돌까?");
            }
            System.out.println();
        }
    }
};
