package ch15collection.lecture;

import java.util.HashSet;
import java.util.Set;

public class C07set {

    public static void main(String[] args) {
        //Set : 객체(item,element,원소,요소)를 담고있는 객체
        // 특징 : 중복된 element를 저장하지 않는다.

        Set<String> set = new HashSet<>();

        //add : element 추가
        set.add("java");
        set.add("spring");
        set.add("react");
        set.add("java");

        //size : 원소의 갯수
        System.out.println(set.size()); //3 : 중복저장을 허용하지 않기때문에

        // contains : 있는지 확인
        System.out.println(set.contains("java"));
        System.out.println(set.contains("html"));

        // remove : 삭제
        boolean remove1 = set.remove("java");
        boolean remove2 = set.remove("html");

        System.out.println(set.size()); //2 : html은 어짜피 없기때문에

        System.out.println("remove1 = " + remove1);
        System.out.println("remove2 = " + remove2);

        // of : 새로운 수정불가 set 객체 만듬
        Set<String> set2 = Set.of("css", "react", "html");

//        set2.add(""); //exceptions
        // 전체탐색
//        set2.get(0); 안된다.
        // 향상된 for문
        System.out.println("향상된 for문 이용한 전체 탐색");
        for (String str : set2) {
            System.out.println(str);
        }
        //forEach
        System.out.println("forEach로 전체탐색");
//        set2.forEach(item -> System.out.println(item));

        set2.forEach(System.out::println);
    }
}
