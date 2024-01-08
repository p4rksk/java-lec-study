package ex14.example1;

import java.util.ArrayList;
import java.util.List;

public class CopyEx01 {
    public static void main(String[] args) {
        var list = new ArrayList<Integer>(); // var은 값이 들어올 때 타입이 결정이 된다.
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);


        //컬렉션 복사만 할때
        List<Integer> newList= new ArrayList<>(list);


        System.out.println(list.hashCode());
        System.out.println(newList.hashCode());



        System.out.println(list.hashCode());
        System.out.println(newList.hashCode());

        //객체를 복사하면 주소값이 바뀐다.즉 두개의 주소 값은 다르다.


            //기존 복사 코드
//        var newList = new ArrayList<>();
//        for (int i = 0; i < list.size(); i++){
//            newList.add(list.get(i));
//        }
    }
}
