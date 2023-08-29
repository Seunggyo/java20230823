package ch07extends.lecture;

public class C05override {

    public static void main(String[] args) {
        MyClass05 o1 = new MyClass05();
        o1.method1(); //부모클래스에 있는 메소드
        MySubClass051 o2 = new MySubClass051();
        o2.method1(); //어떠한 기능이라 적었던 메소드가 변경된 기능이라는 메소드로 재정의되어있는 모습
        o2.method2(); // 추가된 메소드 이다.
    }
}

class MyClass05 {

    public void method1() {
        System.out.println("어떠한 기능");
    }
}

class MySubClass051 extends MyClass05 {

    public void method2() {
        System.out.println("추가된 기능");
    }

    //method1 재정의 (method override)
    public void method1() {
        System.out.println("변경된 기능");
    }
}