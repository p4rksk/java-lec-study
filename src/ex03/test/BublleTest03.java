package ex03.test;

public class BublleTest03 {
    public static void main(String[] args) {
        //스왑 코드

        int [] arr = {4, 3};

        int temp;

        temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;

        System.out.println(arr[0]);
        System.out.println(arr[1]);


    }
}
