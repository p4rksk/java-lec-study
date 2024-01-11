package ex17;

import java.net.InetAddress;
import java.net.UnknownHostException;


//호스트 이름 -> ip주소
public class Host2ip {
    public static void main(String[] args) {
        String hostname = "www.naver.com";

        try {
            //InetAddress 인터넷 주소 클래스의 getByName()을 호출하면 호스트 이름을 전달해서 IP 주소를 저장하고 있는 객체가 반환
            InetAddress address = InetAddress.getByName(hostname);
            System.out.println("IP 주소: " + address.getHostAddress());
        } catch (UnknownHostException e) {
            System.out.println(hostname + "ip의 주소를 찾을 수 없습니다.");
        }
    }
}
