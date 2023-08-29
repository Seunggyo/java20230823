package ch06class;

public class C09static {

    public static void main(String[] args) {

    }
}

class MyClass09 {

    String name; //instance field

    static String model; //static field

    //instance는 결국 하위 개념
    void printName() {
        //instance member끼리 접근 가능
        System.out.println("name = " + name);

        //instance member에서 static member 접근 가능
        System.out.println("model = " + model);
    }

    //static method
    //static member는 설계도 근데 인스턴스로는 무엇인지 알수없기때문에 갈수없다.
    static void printModel() {
        //static member끼리는 접근가능
        System.out.println("model = " + model);

        //static member에서 instance member는 접근 불가능
//        System.out.println("name = " + name);
    }
}
