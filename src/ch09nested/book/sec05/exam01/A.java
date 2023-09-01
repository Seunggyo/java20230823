package ch09nested.book.sec05.exam01;

public class A {

    int field1;

    void method1() {

    }

    static int field2;

    static void method2() {

    }

    class B {

        void method() {
            field1 = 10;
            method1();
            field2 = 10;
            method2();
        }
    }

    static class C {

        void method() {
            field2 = 10;
            method2();
//        field1 = 10;
//        method1();
            //스테틱 클래스이기 때문에 스테틱 멤버는 접근할수 있었지만 인스턴스 멤버는 접근불가능했다.
        }
    }
}
