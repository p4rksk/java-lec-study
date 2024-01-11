package ex17.ex17oneway;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

//요청하는자:클라이언트가 된다.
//요청을 받는 애:서버
public class Client {
        public static void main(String[] args) {


        // lochl hast = 127.0.0.1 (루프백)
        Socket socket;// ip, prot

        {
            try {
                socket = new Socket("127.0.0.1", 10000);

                Scanner sc = new Scanner(System.in);
                String msg = sc.nextLine();

                //가나다라abc
                BufferedWriter bw = new BufferedWriter(
                        new OutputStreamWriter(socket.getOutputStream(), "UTF-8") //통신할때 UTF-8
                );
                bw.write(msg+"\n");
                bw.write(msg);
                bw.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        }
    }
