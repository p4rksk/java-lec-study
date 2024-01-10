package ex17.multi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(30000);
            Socket socket = serverSocket.accept();
            // 소켓 연결 완료됨

            //(t1스레드 생성및 시작)
            t1 thread1 = new t1(socket);
            thread1.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
//버퍼 만들기(received) (t1스레드)
class t1 extends Thread{
    private Socket socket;

    public t1(Socket socket){
        this.socket=socket;
    }

    @Override
    public void run() {
        try {
            BufferedReader BR = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );

            while(true) {
                String reaquestMesge = BR.readLine();

                if (reaquestMesge != null) {
                    System.out.println("클라이언트로 부터 밭은 메세지: " + reaquestMesge);
                } else {
                    System.out.println("클라이언트로부터 메세지를 받지 못했습니다.");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
//버퍼 만들기(received,키보드) (t2 스레드)
class t2 extends Thread {
    private Socket socket;

    public t2(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {

    }
}


//버퍼 만들기 (sand,) (t2 스레드)

