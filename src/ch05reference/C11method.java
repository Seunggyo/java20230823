package ch05reference;

public class C11method {

    public static void main(String[] args) {
        int[] a = method1();
        System.out.println("메인메소드");
        System.out.println(System.identityHashCode(a));
    }

    public static int[] method1() {
        int[] c = {9, 7, 5};
        System.out.println("메소드1내부");
        System.out.println(System.identityHashCode(c));
        return c;
    }
}
