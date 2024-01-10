package ex17.multi;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 30000);
            PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);
            while(true){
                Scanner sc= new Scanner(System.in);
                String a = sc.nextLine();
                pw.println(a);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

//버퍼만들기 (received)
class t3 extends Thread{
    private Socket socket;

    public t3(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            BufferedReader BR = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );

            String reaquestMesge = BR.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

