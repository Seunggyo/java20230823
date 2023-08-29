package ch06class;

public class C06string {

    public static void main(String[] args) {
        String a = "java";
        String b = "spring";
        System.out.println(a.CASE_INSENSITIVE_ORDER);
        System.out.println(b.CASE_INSENSITIVE_ORDER);
        System.out.println(String.CASE_INSENSITIVE_ORDER);

        System.out.println(a.length());
        System.out.println(b.length());

        System.out.println(String.valueOf(30));
        //field나 method둘다 인스턴스 나 스테틱으로 나눌수있다.
    }
}
