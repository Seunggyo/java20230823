package ch07extends.book.sec07.exam02;

public class ChildExample {

    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = child;

        parent.method1();
        parent.method2();
//        parent.method3();  호출 불가 왜? 자동 타입변환은 하였지만 부모클래스에 선언된 메소드만 접근가능하기때문에
    }
}
