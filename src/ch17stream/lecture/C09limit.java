package ch17stream.lecture;

import java.util.List;

public class C09limit {

    // limit : 받은 파라미터 값 만큼 앞에서부터 잘린다.
    public static void main(String[] args) {
        var list = List.of(3, 9, 10, 11, 1, 0, -3);
        list.stream()
            .limit(3)
            .forEach(System.out::println);

        // 리스트를 순서대로 정렬하고 값을 3개 나오게 한다.
        System.out.println();
        list.stream()
            .sorted()
            .limit(3)
            .forEach(System.out::println);
        //이렇게 코드를 만들면 가장 작은값 3개가 나온다

        //앞에 3개를 정렬해서 출력
        System.out.println();
        list.stream()
            .limit(3)
            .sorted()
            .forEach(System.out::println);
    }

}
