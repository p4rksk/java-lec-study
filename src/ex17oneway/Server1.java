package ex17oneway;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

//여러클라이언트랑 통신할때
public class Server1 {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(10000);

            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("클라이언트 연결됨");

                // 각 클라이언트 연결마다 별도의 스레드를 생성하여 처리합니다.
                new Thread(() -> {
                    try {
                        BufferedReader br = new BufferedReader(
                                new InputStreamReader(socket.getInputStream(), "UTF-8")
                        );

                        while (true) {
                            String msg = br.readLine();
                            if (msg == null) {
                                break;
                            }
                            System.out.println(msg);
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }).start();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}