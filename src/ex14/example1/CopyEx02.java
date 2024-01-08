package ex14.example1;

import java.util.Arrays;
import java.util.List;

public class CopyEx02 {
    public static void main(String[] args) {
        List<Integer>list = Arrays.asList(1,2,3,4);

    //.stream은 흙을 뿌린다.(값을 하나 씩 타입을 모래에 벗겨 버린다.)
    // map이라는건 흙이 묻은 값들을 물을 뿌려 씻겨준다고 보면된다.(새로운 타입을 씌운다)
        //map - 가공해서 복사한다.
        List<Integer> newList = list.stream().map(i -> i*100).toList();


        //forEach
        newList.stream().forEach(i -> System.out.println(i));//Consumer 인터페이스 사용

    }
}
