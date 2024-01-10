package ex17.multi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.Scanner;

//동기적 실행
public class Server {
    public static void main(String[] args) {
        try {
            //1. 소켓과 버퍼 만들기
            ServerSocket serverSocket = new ServerSocket(20000);
            Socket socket = serverSocket.accept();
            // 소켓 연결 완료됨
            Scanner sc = new Scanner(System.in);

            // 버퍼 만들기 (recevied)
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );
            //버퍼 만들기 (sand)
            PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);


            //메세지 받기 스레드
            new Thread(() -> {
                while (true) {
                    String requestMsg = null;
                    try {
                        requestMsg = br.readLine();
                        System.out.println("클라이언트로부터 받은 메시지 : " + requestMsg);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }

            }

            }).start();

            // 메세지 보내기 스레드
            new Thread(() -> {
                while (true){
                    String a = sc.nextLine();
                    pw.println(a);
                }
            }).start();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}