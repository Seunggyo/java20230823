package ch07extends.lecture;

public class C07super {

    public static void main(String[] args) {
        MySubClass071 o1 = new MySubClass071();
        o1.method1();
    }
}

class MyClass07 {

    void method1() {
        System.out.println("부모 클래스 메소드 기능");
    }
}

class MySubClass071 extends MyClass07 {

    // *this : 지금 있는 클래스의 인스턴스 호출
    @Override
    void method1() {
        super.method1(); // super : 부모 클래스의 원래 메소드 호출
        System.out.println("자식 클래스의 재정의한 메소드");
//            System.out.println("부모 클래스 메소드 기능");

    }
}
