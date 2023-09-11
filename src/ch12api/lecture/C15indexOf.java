package ch12api.lecture;

public class C15indexOf {

    int a = 1;
    int b = 1;

    public static void main(String[] args) {
        //indexOf: 특정문자열이 시작하는 위치(index) 리턴
        String a = "spring";

        int index = a.indexOf("ring");
        System.out.println(index);

        System.out.println(a.indexOf("pr"));

        String b = "spring is spring";
        System.out.println(b.indexOf("ring"));

        int index1 = b.indexOf("ring", 2);
        System.out.println(index1);
        System.out.println(b.indexOf("ring", 3));

        C15indexOf indexOf = new C15indexOf();
        int a1 = indexOf.a;
        int b1 = indexOf.b;
        System.out.println(a1 == b1);
        String c = "code";
        System.out.println(c.indexOf("e"));
        System.out.println(c.substring(2));
        String d = "ABc";

        System.out.println(d.toLowerCase());
    }
}
