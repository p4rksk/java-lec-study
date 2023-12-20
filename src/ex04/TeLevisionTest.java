package ex04;

class Television {
    private int channel;//채널번호
    private int volume;//채널번호
    private boolean onoff;//채널번호

    Television(int c, int v, boolean o) {
        channel = c;
        volume = v;
        onoff = o;
    }

    void print() {
        System.out.println("채널은 " + channel + "이고 볼륨은 " + volume + "입니다.");
    }
}

public class TeLevisionTest {
    public static void main(String[] args) {
        Television mytv = new Television(7, 10, true);
        mytv.print();

        Television yourTv = new Television(11, 20, true);
        yourTv.print();
    }
}
