package ch08interface.lecture;

public class C03interface {

    public static void main(String[] args) {
        MyInterface031 o1 = new MyClass03();
        MyInterface032 o2 = new MyClass03();

        o1.method1();
        o2.method2();

        MyInterface031 i1 = o1;
        MyInterface032 i2 = o2;

        i1.method1();

        i2.method2();
    }
}

interface MyInterface031 {

    void method1();
}

interface MyInterface032 {

    void method2();
}

//콤마를 활용해 여러 인터페이스를 구현할 수 있다.
class MyClass03 implements MyInterface031, MyInterface032 {

    @Override
    public void method1() {
        System.out.println("MyClass03.method1");
    }

    @Override
    public void method2() {
        System.out.println("MyClass03.method2");
    }
}
