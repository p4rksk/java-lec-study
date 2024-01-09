package ex17oneway;
//

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(10000);
            // 클라이언트의 연결 요청이 들어올 때까지 기다립니다. 연결 요청이 들어오면 그 요청을 수락하고,
            // 해당 클라이언트와 연결된 Socket 객체를 생성하여 반환합니다. 이 Socket 객체를 통해 클라이언트와 데이터를 주고받을 수 있습니다.
            Socket socket = serverSocket.accept();
            System.out.println("클라이언트 연결됨");

            // 클라이언트와 연결된 Socket 객체로부터 입력 스트림을 얻습니다. 이 입력 스트림을 통해 클라이언트로부터 보내진 데이터를 읽을 수 있습니다.
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(socket.getInputStream(), "UTF-8")
            );

            // 클라이언트로부터 보내진 데이터를 계속해서 읽습니다.
            while (true) {
                String msg = br.readLine();
                // 만약 클라이언트로부터 보내진 데이터가 없으면, 반복문을 빠져나갑니다.
                if (msg == null) {
                    break;
                }
                // 클라이언트로부터 보내진 데이터를 출력합니다.
                System.out.println(msg);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
