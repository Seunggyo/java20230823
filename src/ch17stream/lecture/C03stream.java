package ch17stream.lecture;

import java.util.List;
import java.util.stream.Stream;

public class C03stream {

    public static void main(String[] args) {
        List<String> list = List.of("java", "css", "spring");
        Stream<String> stream = list.stream();

        stream.count();
        //최종 연산이 끝난 stream을 재사용할 수 없음
//        stream.count(); // exception

        Stream<String> stream1 = list.stream();
        stream1.count();
        System.out.println("실행중...");
    }

}