package ex03.test;

public class BinaryTest02 {
    public static void main(String[] args) {

        // 시간 복잡도 log2(n) -> log2(13) -> 3,
        //이진 검색 ==> 반드시 정렬이 되어 있어야 한다.
        int[]arr = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // 9/2 = 4 4번 인덱스를 찾을 8과 비교해보고 작으니 4번인덱스 뒤에 있는 기준점을 기준으로
                                                // 찾는다.

        int N = arr.length;

        final int target = 8;
        int start = 0;//인덱스
        int end = N - 1;//인덱스
        int mid = (end - start) / 2;//인덱스

        //1회전
        if (arr[mid]==target) {
            System.out.println(target + "값은" + mid + "번지에 있습니다.");
        }

        {
        if (arr[mid] <  target) { // 기대값 start 5, end 8
        start = mid + 1;
        }

        if (arr[mid] > target) { // 기대값 start 0, end 3
        end = mid - 1;
        }

        System.out.println(start);
        System.out.println(end);

        }
        if (arr[mid] > target){

        }




    }
}
