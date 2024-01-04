package ex13;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();

        map.put("kim","1234");
        map.put("park","pass");
        map.put("lee","word");

        System.out.println(map.get("lee")); // 키를 가지고 값을 참조한다.

        for (String key:map.keySet()){ //keySet()은 키들의 집합을 반환한다. 모든 항목을 방문한다.
            String value = map.get(key);
            System.out.println("key="+key+",vlaue="+value);
        }
        map.remove(3); //하나의 항목을 삭제한다.
        map.put("choi","password"); //하나의 항목을 대치한다.
        System.out.println(map);


        }
    }
