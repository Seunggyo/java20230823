package ch17stream.book.exercise.p06;

import java.util.List;

public class Example {

    public static void main(String[] args) {
        var list = List.of(new Member("홍길동", 30), new Member("신용권", 40), new Member("감자바", 26));

        list.stream()
            .map(m -> m.getAge())
            .forEach(System.out::println);

        Integer sum = list.stream()
            .map(m -> m.getAge())
            .reduce(0, Integer::sum);
        System.out.println("나이합계 : " + sum);
        System.out.println("가장 많은 나이 reduce로 출력");
        Integer reduce = list.stream()
            .map(member -> member.getAge())
            .reduce(Integer.MIN_VALUE, Math::max);
        System.out.println("reduce = " + reduce);

        System.out.println("가장 작은 나이 reduce로 출력");
        Integer reduce1 = list.stream()
            .map(member -> member.getAge())
            .reduce(Integer.MAX_VALUE, Math::min);
        System.out.println("reduce1 = " + reduce1);

    }

}
