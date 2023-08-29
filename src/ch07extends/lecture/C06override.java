package ch07extends.lecture;

public class C06override {

    public static void main(String[] args) {
        MySubClass061 o1 = new MySubClass061();
        o1.method1(); //자식클래스의 메소드라는 말이 나올수있도록 코드 설계
    }
}

class MySubClass061 extends MyClass06 {

    @Override
    // 컴파일시 재정의한 메소드인지 검증하기 위해 필요
    // 만약 오타가 있는 상태에서 컴파일을 할경우 오류를 만들어 실행이 안된다.
    // 검증용
    public void method1() {
        System.out.println("자식 클래스의 메소드");
    }
}

class MyClass06 {

    public void method1() {
        System.out.println("부모클래스의 메소드");
    }
}