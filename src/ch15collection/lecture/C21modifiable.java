package ch15collection.lecture;

import java.util.HashMap;
import java.util.Map;

public class C21modifiable {

    public static void main(String[] args) {
        Map<String, Integer> map = Map.of(
            "흥민", 7,
            "강인", 10,
            "민재", 30
        );

        Map<String, Integer> map1 = new HashMap<>(map);

        map1.put("지성", 13);

        System.out.println("map.size() = " + map.size());
        System.out.println("map1.size() = " + map1.size());
    }

}
