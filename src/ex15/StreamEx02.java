package ex15;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamEx02 {
    public static void main(String[] args) {
        //보조 스트림 만들기
        InputStreamReader ir = new InputStreamReader(System.in);
        char[] ch = new char [4];

        //
        try {
            ir.read(ch);//ch 보조 스트림으로 부터 입력받은것을 읽는다.

            for (char c :ch){
                System.out.print(c + " ");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
