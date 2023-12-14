package ex03;

public class Sum {
    public static void main(String[] args) {
        int sum = 0;

        for(int i = 1; i<=10; i++)
            sum +=i; // sum = sum+i; 와 동일한 의미이다.

        System.out.println("1부터 10까지의 정수의 합 =" + sum);
    }
}
