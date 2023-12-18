package ex03.test;

public class BinaryTest01 {
    public static void main(String[] args) {
        //이진 검색 ==> 반드시 정렬이 되어 있어야 한다.
        int[]arr = {1, 2, 3, 4, 5, 6, 7, 8,9}; // 9/2 = 4 4번 인덱스를 찾을 8과 비교해보고 작으니 4번인덱스 뒤에 있는 기준점을찾는다.


        //target = 8

        // starte = 0 ~ 8번지
        // mid = N /2 = 4 -> arr[4] -> 값 : 5
        // if(8==5) ->mid 위치에 타겟이 있다.
        // if(8>5) 참


        // 5번지 8번지
        // mid = arr[7] --> 값 =8
        // if(8==8) ->mid 위치에 타겟이 있다.
        // if(8>8)


    }
}
