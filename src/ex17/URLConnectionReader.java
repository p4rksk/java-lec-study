package ex17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

//HTTP연결을 통하여 인터넷에서 파일 읽기
public class URLConnectionReader {
    public static void main(String[] args) throws IOException {
        //URL 클래스의 객체 생성
        URL site = new URL("https://www.naver.com/");

        //URL 객채를 이용해서 연결하기 위하여 URLConnection 객체 생성
        URLConnection url = site.openConnection();

        //URLConnection 객체의 getInputStream()메소드를 호출하여서 입력 스트림을 얻기
        BufferedReader in = new BufferedReader(
                new InputStreamReader(url.getInputStream())
        );
        String inLine;

        //스트림에서 데이터 읽기
        while ((inLine = in.readLine()) != null)
            System.out.println(inLine);
        in.close();
    }
}
