package ch16lambda.lecture;

public class C08methodReference {

    public static void main(String[] args) {
        MyClass08 o2 = new MyClass08();
        MyInterface08 o1 = (a, b) -> o2.otherMethod(a, b);
        MyInterface08 o3 = o2::otherMethod;
    }
}

class MyClass08 {

    void otherMethod(int a, int b) {

    }
}

interface MyInterface08 {

    void method(int a, int b);
}