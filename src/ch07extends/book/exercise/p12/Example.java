package ch07extends.book.exercise.p12;

public class Example {

    public static void action(A a) {
        a.method1();
        if (a instanceof C c) {
            //만약 구버전 자바일경우에는
            //if (a instanceof C){
//            C c = new C();
            //를 따로 넣어줘야 실행이 가능하다.
            c.method2();
        }
    }

    public static void main(String[] args) {
        action(new A());
        action(new B());
        action(new C());
    }
}
