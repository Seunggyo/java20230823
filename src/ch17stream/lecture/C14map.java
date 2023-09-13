package ch17stream.lecture;

import java.util.List;

public class C14map {

    public static void main(String[] args) {
        var list = List.of("java", "css", "react", "spring");

        System.out.println("string의 글자수 구하기");
        list.stream()
            .map(x -> x.length())
            .forEach(System.out::println);
    }

}
