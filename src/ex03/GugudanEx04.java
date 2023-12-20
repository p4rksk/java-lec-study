package ex03;

class GugudanUtil {
    static void gugudan(int x){ // 매개 변수도 스택에 생성됨 외부 접근 불가
        for (int i = 1; i <= 9; i++) {
            System.out.println(x + "*" + i + "=" + (x * i));
        }
        System.out.println();
    }
}

public class GugudanEx04 {



    public static void main(String[] args) {
    // Gugudan util 클래스에 gugudan 정적 메서드를 호출 하시오
    // 파라미터는 int 1개가 필요합니다.
    // 구구단을 출력해주는 메서드
        GugudanUtil.gugudan(5);
    }
}
