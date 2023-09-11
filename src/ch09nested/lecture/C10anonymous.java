package ch09nested.lecture;

public class C10anonymous {

    public static void main(String[] args) {
//        MyClass10 o1 = new MyClass10();
        MyClass10 o2 = new MySubClass101();
        MyClass10 o3 = new MyClass10() {
            //익명 메소드로 상속없이 바로 구현
        };
    }
}

class MySubClass101 extends MyClass10 {

}

abstract class MyClass10 {

}
