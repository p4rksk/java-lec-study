package ex15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamEx03 {
    public static void main(String[] args) {
        InputStreamReader ir =new InputStreamReader(System.in); // System.in 상대방 컴퓨터 주소로 바꾸면 된다.
        BufferedReader br = new BufferedReader(ir);

        try {
            String line = br.readLine();
            System.out.println(line);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
