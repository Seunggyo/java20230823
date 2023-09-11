package ch15collection.lecture;

import java.util.HashSet;
import java.util.Set;

public class C08set {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("java");
        set.add("kangin");
        set.add("min jae");

        set.forEach(System.out::println);

        System.out.println("시간이 흘러");
        set.forEach(System.out::println);

        // hashset의 특징 : 순서를 유지하지 않고 저장
        // set의 특징 : 중복 저장 되지 않음
        
    }
}
