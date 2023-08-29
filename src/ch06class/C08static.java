package ch06class;

public class C08static {

    public static void main(String[] args) {
        MyClass08 o1 = new MyClass08();

        o1.name = "java";
        o1.printName();

        //static member 는 클래스 이름으로 바로 접근해야한다.
        MyClass08.name = "spring";
        MyClass08.printName(); //이것이 권장사항이다.

        o1.name = "java1";
        o1.printName();
        MyClass08.printName();

    }
}

class MyClass08 {

    //static member = static field + static method
    static String name;

    static void printName() {
        System.out.println("name = " + name);
    }
}