package ch16lambda.lecture;

public class C03parameter {

    //파라미터가 두개일때 예제
    public static void main(String[] args) {
        MyInterface03 o1 = (int x, int y) -> {
            //몸통 작성됨

        };
        MyInterface03 o2 = (x, y) -> {/*몸통*/};
    }
}

@FunctionalInterface
interface MyInterface03 {

    void method(int x, int y);
}