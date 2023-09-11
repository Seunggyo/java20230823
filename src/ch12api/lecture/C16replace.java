package ch12api.lecture;

public class C16replace {

    public static void main(String[] args) {
        //replace : 특정 문자열 -> 다른문자열로 변경

        String a = "spring";
        String a1 = a.replace("sp", "abc");

        System.out.println(a);
        System.out.println(a1);

        String b = "java is java";

        String b1 = b.replace("java", "python");
        System.out.println(b);
        System.out.println(b1);

        String c = "JAVA is java";
        String c1 = c.replace("java", "html");

        System.out.println(c1); // 정확히 일치하는 내용만 변경됨


    }
}
