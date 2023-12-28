package ex08.example;

public class StringEx02 {
    public static void main(String[] args) {
        // 문서
        // ? 뒤를 쿼리스트링이라고 한다.
        // 쿼리스트링은 키=값 형태의 데이터의 집합이다.
        // 키=값이 여러개일때는 &로 구분한다.\
        // 어떤 URL을 받아도 똑같은 값이 나오게 만들기
        String url = "http://www.naver.com?username=ssar&password=1234";


        // username값과, password값 찾아보기
        String[] spc = url.split("\\?");
        for (String word : spc) {
        //    System.out.println(word);
        }
        String a = spc[1];

        String []b = spc[1].split("=");
        System.out.println(b[2]);//password 값

        String []c = b[1].split("&");
        System.out.println(c[0]); // username 값


        //배열의 인덱스는 배열에 넣을 수 있지만 배열은 배열에 넣지 못한다.



    }
}
