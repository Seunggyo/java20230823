package ch17stream.lecture;

import java.util.List;

public class C02stream {

    public static void main(String[] args) {
        List<String> list = List.of("ab", "de", "xy");

//        Stream<String> stream = list.stream();
//        Stream<String> stream1 = stream.map(e -> e + e);
//        long count = stream1.count();//

//        위에 있는 코드를 steam 으로 쓴다하면 이런식으로 되어있다.
        list.stream()
            .map(e -> e + e)
            .filter(e -> e.length() > 1)
            .count();
    }

}
