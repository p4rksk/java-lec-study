package ex14;

import java.util.*;

public class StreamEx01 {
    public static void main(String[] args) {
        //클래스랑 맵의 차이.
        //맵은 오타를 낼 수 있다. 데이터 값이 object 일때는 맵 에서 클래스의 값을 호출 할때 다운 캐스팅해서 찾아야된다.

        Map<String, Object> data = new HashMap<>();
        data.put("name", "홍길동");
        data.put("age", 20);

        Map<String, Object> data2 = new HashMap<>();
        data2.put("name", "장보고");
        data2.put("age", 20);

        Map<String, Object> data3 = new HashMap<>();
        data3.put("name", "이순신");
        data3.put("age", 20);

        List<Map<String,Object>> arr = Arrays.asList(data,data2,data3);

        // 애들의 나이를 한살씩 낮추는걸로 바꾼다.

        List<Map<String,Object>> newArr = arr.stream().map(d ->{
            int newAge = (Integer) d.get("age") -1 ;

            d.put("age", newAge);
            return d;
        }).toList();

        newArr.stream().forEach(d -> {
            System.out.println(d.get("age"));
        });



    }
}
