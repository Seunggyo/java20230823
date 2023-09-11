package ch16lambda.lecture;

import java.util.Arrays;
import java.util.List;

public class C04parameter {

    //파라미터가 하나일때는 괄호도 생략이 가능하다.
    public static void main(String[] args) {
        MyInterface04 o1 = (int x) -> {
        };
        MyInterface04 o2 = (x) -> {
        };
        MyInterface04 o3 = x -> {
        };

        List<String> list = List.of("java", "spring", "css", "html");
        list.forEach(e -> System.out.println(e));

        int[] arr = {10, 20, 30, 40, 100, 200, 300};
        Arrays.stream(arr).forEach(e -> System.out.println(e));
    }
}

@FunctionalInterface
interface MyInterface04 {

    void method(int x);
}
