package ch15collection.lecture;

import java.util.HashSet;
import java.util.Set;

public class C20modifiable {

    public static void main(String[] args) {
        Set<String> set = Set.of("java", "spring", "react");
        Set<String> set1 = new HashSet<>(set);

        set1.add("html");

        System.out.println("set.size() = " + set.size());
        System.out.println("set1.size() = " + set1.size());
    }

}
