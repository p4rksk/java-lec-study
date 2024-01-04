package ex13;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String>list = new LinkedList<String>();


        list.add("MILK");
        list.add("BREAD");
        list.add("BUTTER");
        list.add(1,"APPLE"); // 인덱스 1에 "APPLE"을 삽입
        list.add(2,"GRAPE"); // 인덱스 2에 "GRAPE"를 삽입
        list.remove(3);             // 인덱스 3의 값을 삭제 한다.

        for (int i = 0; i< list.size(); i++)
            System.out.println(list.get(i)+"");
    }
}
