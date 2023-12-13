package ex02;

public class ComOperator {
    public static void main(String[] args) {
        System.out.println((3 == 4 ) + "");
        System.out.println((3 != 4 ) + ""); // != 다르다는 의미이다.
        System.out.println((3 > 4 ) + "");
        System.out.println((3 < 4 ) + "");

        System.out.println((3 == 3 && 4 ==7) + " "); // 둘다 참이여야 결과가 true로 나온다.
        System.out.println((3 == 3 || 4 == 7) + " "); // 둘중에 하나만 true면 true로 결과가 나온다.
    }
}
