package ex14.example1;

import java.util.Arrays;
import java.util.List;

public class CopyEx03 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4);

        //filter Stream은 컬렉션에서 지원
        List<Integer> newList = list.stream().filter(i -> i < 3).toList();
        //.to list는 list의 저장한는 문법

        newList.stream().forEach(i-> System.out.println(i));
    }   //출력하는데 forEach()사용
}
