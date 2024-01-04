package ex13;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
    int number;
    String name;

    public Student(int number, String name){
        this.number=number;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
    public int compareTo(Student s){
        return s.number-number;
    }
}
public class SortTest {
    public static void main(String[] args) {
        Student array[]= {
          new Student(2,"김철수"),
          new Student(3,"이철수"),
          new Student(1,"박철수"),
        };
        List<Student> list = Arrays.asList(array);
        Collections.sort(list);// 만약 역순으로 정렬하기를 원한다면 Collections.sort(list,Collections.reverseOrder())를 사용
        System.out.println(list);
    }
}
