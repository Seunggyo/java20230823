package ch16lambda.lecture;

public class C02lambda {

    public static void main(String[] args) {
        //lambda
        //(파라미터 목록) -> {메소드 몸통}
        MyInterface02 o1 = () -> {
            System.out.println("C02lambda.main");
        };
        o1.method();

        //method몸통이 한줄인 경우는 중괄호 생략이 가능하다
        MyInterface02 o2 = () -> System.out.println("C02lambda.main");
        o2.method();
    }
}

@FunctionalInterface
interface MyInterface02 {

    //파라미터 없는 메소드
    //return값도 없는 메소드
    void method();
}