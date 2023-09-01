package ch09nested.lecture;

import ch09nested.lecture.MyClass02.NestedClass02;

public class C02staticNested {

    MyClass02.NestedClass02 o1 = new NestedClass02();
}

class MyClass02 {

    static class NestedClass02 {

    }

    void method() {
        NestedClass02 o1 = new NestedClass02();
    }
}