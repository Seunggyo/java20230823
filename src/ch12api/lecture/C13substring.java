package ch12api.lecture;

public class C13substring {

    public static void main(String[] args) {
        //substring : 부분 문자열 추출
        String a = "spring";
        String s1 = a.substring(0, 2); //sp
        System.out.println(a);
        System.out.println(s1);
        String s2 = a.substring(2, 5); //rin
        System.out.println(s2);
        System.out.println(a.lastIndexOf('s'));
        System.out.println(a.substring(a.length() - 2, a.length()));

    }
}
