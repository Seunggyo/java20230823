package ch07extends.lecture;

public class C27final {

    public static void main(String[] args) {
        final int a = 3;
        //final 변수 : 값을 단 한 번만 할당 할 수 있다. 할당을 안하는것도 안됨
    }
}

class MyClass27 {

    final int age = 3;

    final String name;

    MyClass27() {
        this.name = "java";
    }

    MyClass27(String name) {
        this.name = name;
    }
}