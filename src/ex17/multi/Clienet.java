package ex17.multi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Clienet {
    public static void main(String[] args) {
        try {
            //1. 소켓과 버퍼 만들기
            Socket socket = new Socket("192.168.0.43",20000);
            Scanner sc = new Scanner(System.in);
            PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()) //소켓에 버퍼 달기
            );


            //2. 메세지 전송 스레드
            new Thread(() -> {
                while (true){
                    String a = sc.nextLine();
                    pw.println(a);
                }
            }).start();


            //3. 메시지 읽기 스레드
            new Thread(() -> {
                while (true) {
                    String requestMsg = null;
                    try {
                        requestMsg = br.readLine();
                        System.out.println("서버로부터 받은 메시지 : " + requestMsg);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }

                }

            }).start();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
