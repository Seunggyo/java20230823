package ch09nested.lecture;

public class C01nested {

    public static void main(String[] args) {
//        MyClass01.NestedClass01 o1 = new MyClass01().NestedClass01; 이거는 못씀
        MyClass01 o1 = new MyClass01();
        MyClass01.NestedClass01 o2 = o1.new NestedClass01(); //라고 쓸수는 있지만 왠만해선 쓸일이 없다.
    }
}

class MyClass01 {
    //중첩 클래스 :
    //외부 클래스 내에서만 사용할 목적으로 만듦

    class NestedClass01 {
        //필드

        //생성자

        //메소드
    }

    void method1() {
        //외부 클래스 내에서 사용할 때
        NestedClass01 o1 = new NestedClass01();

    }
}