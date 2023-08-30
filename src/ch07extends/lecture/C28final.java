package ch07extends.lecture;

public class C28final {

    public static void main(String[] args) {

    }

}

class MyClass28 {

    //final 메소드는 재정의(override)할수 없다.
    final void method1() {
        System.out.println("어떤 메소드");
    }
}

class MySubClass281 extends MyClass28 {
//    void method1() 재정의 못해서 에러표시난다.
}
