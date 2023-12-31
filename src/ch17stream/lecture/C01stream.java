package ch17stream.lecture;

import java.util.List;
import java.util.stream.Stream;

public class C01stream {

    public static void main(String[] args) {
        List<String> list = List.of("java", "spring", "css", "react");

        for (String item : list) {
            System.out.println("item = " + item);
        }
        //stream
        Stream<String> stream = list.stream();

        // method
        // 중간연산 : intermediate operation 중간에 여러번
        stream.limit(5);

        // 최종연산 : terminal operation 마지막에 한번
        // 최종연산 후 steam 재사용 불가
        // 최종연산 시 중간 연산을 같이 처리함.
        stream.count();

    }

}
