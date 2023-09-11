package ch12api.lecture;

public class C17replaceAll {

    public static void main(String[] args) {
        //replaceAll : 특정 패턴 => 다른 문자열로 변경
        String a = "JAVA is java";

        String a1 = a.replace("java", "python");
        System.out.println(a1);

        String a2 = a.replaceAll("(java|JAVA)", "python");
        System.out.println(a2);


    }
}
