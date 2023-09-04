package ch09nested.lecture;

public class C08interface {

    public static void main(String[] args) {
        class ConcreteClass implements MyClass08.NestedInterface {

            @Override
            public void method2() {
                System.out.println("ConcreteClass.method2");
            }

        }
        ConcreteClass c1 = new ConcreteClass();
        c1.method2();

    }


}

class MyClass081 implements MyClass08.NestedInterface {

    @Override
    public void method2() {
        System.out.println("MyClass081.method2");
    }
}

class MyClass08 {

    interface NestedInterface {
        // public final static field
        // public abstract instance method (제일 중요)

        void method2();
        // private instance method
        // default instance method
        // private static method
    }

    void method1() {
        class ConcreteClass implements NestedInterface {

            @Override
            public void method2() {
                System.out.println("ConcreteClass.method2");
            }
        }

        ConcreteClass concreteClass = new ConcreteClass();
        concreteClass.method2();

    }
}