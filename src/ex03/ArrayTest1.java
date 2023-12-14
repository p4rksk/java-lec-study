package ex03;

public class ArrayTest1 {
    public static void main(String[] args) {

        int[]s = new int[10];

        for (int i=0; i<s.length; i++){ // 변수명. lngth는 배열의 공간을 나타내는 문법이다.
            s[i]=i;
            System.out.print(s[i]+" ");
        }
    }
}
