package ch09nested.lecture;

public class C04access {
    //static member는 instance member에 접근할 수 없다.

    int instanceField;

    static int staticField;

    static class StaticNestedClass {

        void method1() {
            System.out.println(staticField);
//            System.out.println(instanceField); 는 안된다 static끼리는 접근가능하지만 스테틱이 인스턴스접근은 불가
        }
    }

    class InnerClass {

        void method1() {
            System.out.println(instanceField);
        }
    }
}
