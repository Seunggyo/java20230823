package ch15collection.lecture;

import java.util.HashMap;
import java.util.Map;

public class C12map {

    public static void main(String[] args) {
        // Map : key, value 쌍(entry)를 저장
        // key가 중복된 entry가 있을수 없다.

        Map<String, String> map = new HashMap<>();

        // entry 추가 메소드

        map.put("student1", "손흥민");
        map.put("student2", "이강인");
        map.put("student3", "김민재");

        // size : entry의 갯수확인

        System.out.println("map.size() = " + map.size());

        // entry를 교체하는 메소드

        map.put("student3", "박지성");

        // entry를 삭제하는 메소드
        // key만 넣어도 된다.
        map.remove("student2");

        // entry의 value를 얻는 메소드

        String s = map.get("student1");
        System.out.println("s = " + s);

        
    }

}
