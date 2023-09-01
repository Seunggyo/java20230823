package ch08interface.lecture;

public class C14staticMethod {

    public static void main(String[] args) {
        MyInterface14.method1();//public static method는 인스턴스 생성 없이 바로 접근 가능
        MyInterface14.method2();

//        MyInterface14.common(); // private는 본인 클래스에서만 사용하기때문에 사용이 불가능하다.
    }
}

interface MyInterface14 {
    // 필드 : public static final

    //인스턴스 메소드 :
    // 추상 메소드
    // default method
    // private method

    // staitc(정적)method
    // public static method
    // privat static method

    static void method1() {
        System.out.println("MyInterface14.method");
        common();
    }

    static void method2() {
        System.out.println("MyInterface14.method");
        common();
    }

    private static void common() {
        System.out.println("어떤 기능 1");
    }
}