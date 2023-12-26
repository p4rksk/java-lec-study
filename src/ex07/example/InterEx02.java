package ex07.example;

// 라이브러리 판매
interface EventListener{ //event를 감지하는 시점이 컴퓨터의 최고 속도로한다.
    void action(); //시간을 길게잡으면 리소스를 적게 먹는대신 감지가 느리다.
                    //시간을 짧게잡으면 리소스를 많이 먹는대신 감지가 빠르다.
}

//라이브러리 판매자가 생성 (구현체가 없을경우 내가 생성)
class MyApp{
    public void click(EventListener l){
        l.action();
    }
}





public class InterEx02 {
    public static void main(String[] args) {
        MyApp app = new MyApp();
        app.click(() -> {
            System.out.println("회원가입 로직이 실행됩니다.");
        });
    }
}