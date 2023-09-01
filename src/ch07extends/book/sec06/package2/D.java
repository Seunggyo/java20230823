package ch07extends.book.sec06.package2;

import ch07extends.book.sec06.package1.A;

public class D extends A {

    public D() {
        super();
    }

    public void method1() {
        this.field = "value";  //상속을 통해서 사용가능
        this.method();
    }
//public void method2(){
//    A a = new A();        직접 객체 생성한것은 안됨
//    a.field = "value";
//    a.method();
}

