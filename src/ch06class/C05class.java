package ch06class;

public class C05class {

    public static void main(String[] args) {
        MyClass05 o1 = new MyClass05();
        MyClass05 o2 = new MyClass05();
        System.out.println("o1의 참조값 " + System.identityHashCode(o1));

        o1.age = 30;

        o1.model = "java";  //스테틱필드는 앞에 인스턴스를 넣는것을 권장하지 않음
        MyClass05.model = "spring"; // 클래스를 앞에 붙이는것을 권장한다.
        System.out.println("o1.age = " + o1.age);
        System.out.println("o1.model = " + o1.model); //java
        System.out.println("o2 = " + o2.age);
        System.out.println("o2.model = " + o2.model); //java
    }

}

class MyClass05 {

    //속성 fields
    int age; //instance field
    static String model; //static field, class field, 정적필드   클래스에 고정되는 값

}