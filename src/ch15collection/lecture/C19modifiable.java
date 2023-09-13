package ch15collection.lecture;

import java.util.ArrayList;
import java.util.List;

public class C19modifiable {

    public static void main(String[] args) {
        List<String> list1 = List.of("html", "css", "react", "js");
        System.out.println(list1);

        List<String> list2 = new ArrayList<>(list1);

        list2.add("java");
        System.out.println(list2);
        System.out.println("실행중...");
    }

}
