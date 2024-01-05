package ex14.exaple1;

import java.util.Arrays;
import java.util.List;

public class CopyEx03 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4);

        //filter Stream은 컬렉션에서 지원
        List<Integer> newList = list.stream().filter(i -> i < 3).toList();

        newList.stream().forEach(i-> System.out.println(i));
    }
}
