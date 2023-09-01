package ch08interface.lecture;

public class C12private {

}

interface MyInterface12 {

    default void method1() {
        //public instance method
        someFeature();
        System.out.println("어떤 기능 2");
    }

    default void method2() {
        //public instance method
        someFeature();
        System.out.println("어떤 기능 3");
    }

    private void someFeature() {
        //private instance 메소드
        System.out.println("어떤 기능 1");
    }
}
