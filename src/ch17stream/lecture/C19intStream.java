package ch17stream.lecture;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class C19intStream {

    public static void main(String[] args) {
        IntStream.of(9, 10, 0, 3, 1, 22, 77, 33);

        // 최대값 구하기
        OptionalInt max = IntStream.of(9, 10, 0, 3, 1, 22, 77, 33)
            .max();
        System.out.println("최대값은 " + max.orElse(0));
        // 최소값 구하기
        OptionalInt min = IntStream.of(9, 10, 0, 3, 1, 22, 77, 33)
            .min();
        System.out.println("최소값은 " + min.orElse(0));
        // 평균 구하기
        OptionalDouble average = IntStream.of(9, 10, 0, 3, 1, 22, 77, 33)
            .average();
        System.out.println("평균은 " + average.orElse(0));

    }

}
