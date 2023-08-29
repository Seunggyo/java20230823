package ch07extends.lecture;

public class C09polymorphism {

    public static void main(String[] args) {
        MySubClass091 o1 = new MySubClass091();
        MyClass09 o2 = o1; //상위타입으로 됨      지금 o2의 실제 인스턴스는 MySubClass이다.

        MyClass09 o3 = new MyClass09(); // o3는 MyClass의 값을 받아온다.
//        MySubClass091 o4 = o3;  하위타입에서 상위타입으론 못함

        System.out.println(System.identityHashCode(o1));
        System.out.println(System.identityHashCode(o2));
        System.out.println(System.identityHashCode(o3));

        o1.method(); // 자식 메소드 변수의 타입과 관계없이 실제 인스턴스의 메소드가 실행
        o2.method(); // 자식 메소드 실제 인스턴스의 메소드 실행
        o3.method(); // 부모 메소드
    }
}

class MyClass09 {

    void method() {
        System.out.println("부모 메소드");
    }
}

class MySubClass091 extends MyClass09 {

    @Override
    void method() {
        System.out.println("자식 메소드");
    }
}
