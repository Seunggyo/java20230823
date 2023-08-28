package ch06class;

public class C02class {

    public static void main(String[] args) {
        Myclass02 o1 = new Myclass02();
        o1.name = "spring";
        System.out.println("o1 = " + o1.name);

        method1(o1);
        System.out.println("o1.name = " + o1.name);
    }

    public static void method1(Myclass02 p) {
        p.name = "java";
    }
}

class Myclass02 {

    String name;

}