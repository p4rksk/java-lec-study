package ex03;

import java.util.Arrays;
import java.util.Random;

public class LottoEx01 {
    public static void main(String[] args) {
        int arr[] = new int[6];
        Random r = new Random();

        int num;

        for (int i = 0; i < arr.length; i++) {
            if(i==0){
                num = r.nextInt(45)+1;//boound의 숫자가 0부터 시작이니 +1 하기
                arr[i] = num;

            }else {
                while (true){
                num = r.nextInt(45)+1;
                    for (int j = 0; j < arr.length; j++) {
                        if(arr[i-1] != num){
                            arr[i] = num;
                            break;
                        }

                    }
                //인덱스 1일때는 0번지 비교 인덱스 2일때는 0,1 비교 인덱스 3일때는 0,1,2 비교

                }
            }

        }
    }
}

