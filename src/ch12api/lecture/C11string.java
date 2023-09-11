package ch12api.lecture;

public class C11string {

    public static void main(String[] args) {
        String a = "java"; //리터럴 하게 쓴거는 참조값이 같다.
        String b = "java";
        String c = new String("java");

        System.out.println(a == b); //그래서 a ,b 는 동일하다.
        System.out.println(a == c);

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
    }
}
