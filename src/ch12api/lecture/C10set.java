package ch12api.lecture;

import java.util.HashSet;

public class C10set {
//set : 집합의 영문명

    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add(new Object());
        set.add(new Object());

        System.out.println(set.size());

        set.add(new String("java"));

        System.out.println(set.size());

        set.add(new String("java"));
        System.out.println(set.size());
    }
}
