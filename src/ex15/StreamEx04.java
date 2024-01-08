package ex15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class StreamEx04 {
    public static void main(String[] args) {
        //키보드로 입력 할때
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            bw.write("안녕\n");  // 통신에서 \는 줄바꿈을 하려고 하는게아니라 읽는 범위를 정하려고 사용한다.
            bw.write("반가워\n"); //read line은 한번에 소비할 때 역슬래쉬 까지 읽는다.역슬래쉬 뒤는 데이터를 버린다.
            bw. flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
