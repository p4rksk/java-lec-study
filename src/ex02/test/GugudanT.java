package ex02.test;
// \t는 탭, \n은 엔터

// 단이 바뀔때 마다 옆으로 나열되게끔 결과를 출력하기


public class GugudanT {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int x = 2; x <= 9; x++) {
                System.out.print(x + "*" + i + "=" + x * i + "\t");
            }
            System.out.println();
        }
    }
}

