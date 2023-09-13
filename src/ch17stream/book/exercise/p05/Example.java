package ch17stream.book.exercise.p05;

import java.util.List;

public class Example {

    public static void main(String[] args) {
        var list = List.of("This is a java book",
            "Lambda Expressions",
            "Java8 supports lambda expression");

        System.out.println("고전적 for문 사용");
        for (String item : list) {
            if (item.toLowerCase().matches(".*java.*")) {
                System.out.println(item);
            }
        }
        System.out.println("stream사용방식");
        list.stream()
            .filter(x -> x.toLowerCase().contains("java"))
            .forEach(System.out::println);
    }
}
