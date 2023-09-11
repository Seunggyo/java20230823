package ch15collection.lecture;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C13map {

    public static void main(String[] args) {
        //map 전체 탐색
        Map<String, String> map = new HashMap<>();
        map.put("student1", "흥민");
        map.put("student2", "강인");
        map.put("student3", "민재");
        //향상된 for문
        System.out.println("향상된 for문으로 전체탐색");
        Set<Map.Entry<String, String>> entries = map.entrySet();

        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        //keySet
        System.out.println();
        System.out.println("keySet이용하여 전체탐색");
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " : " + map.get(key));
        }

        //forEach
        System.out.println();
        System.out.println("forEach메소드로 전체탐색");
        map.forEach((s, s2) -> System.out.println(s + " : " + s2));

    }

}
