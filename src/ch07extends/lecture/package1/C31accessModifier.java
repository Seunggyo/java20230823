package ch07extends.lecture.package1;


import ch07extends.lecture.MyClass30;

public class C31accessModifier {

    public static void main(String[] args) {
        MyClass30 o1 = new MyClass30();

        o1.publicMethod();
//        o1.packagePrivateMethod();//안됨 될수가 없다.
//        o1.protectedMethod(); 다른패키지라 안됨
    }
}
