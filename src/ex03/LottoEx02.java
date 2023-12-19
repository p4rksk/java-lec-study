package ex03;

import java.util.Arrays;
import java.util.Random;

public class LottoEx02 {
    public static void main(String[] args) {
        int arr[] = new int[6];
        Random r = new Random();
        int num;
        boolean isSame;

        //1. 6바퀴 돌면서 로또 번호를 추첨할 예정
        //2. 첫번째 바퀴는 공을 꺼내서 추첨한 번호를 그대로 입력
        //3. 두번째 바퀴 부터는 공을 꺼내서 이전에 추첨한 모든 번호와 비교 (is Same 값 만들기)
        //4. is Same == true (3번부터 다시 시작)
        //5. is Same == false (공 집어 넣기- 다시 3번 부터 시작)



        for (int i = 0; i < 6; i++) {
            //공 꺼내서 바로 추가
            if(i==0){
                num = r.nextInt(45)+1;
                arr[i] = num;
                continue;
            }

            // 38, 9
           while(true){
               //공을 꺼내는 코드
               isSame=false;
               num= r.nextInt(45)+1; // i==0과 비교

               /**
                * 이전 번호들과 비교 하는 코드
                * i == 1(0비교)
                * i == 2(0,1비교)
                * i == 3(0,1,2비교)
                */
               for (int j = i-1; j >= 0 ; j--) {
                   if(arr[j]==num){
                       isSame = true;
                       break;
                   }
               }

               // 3. 동일한 번호 가 없을때 값 추가
               if(!isSame){
                   arr[i] = num;
                   break;
               }
           }
        }
        System.out.println(Arrays.toString(arr));
    }
}
