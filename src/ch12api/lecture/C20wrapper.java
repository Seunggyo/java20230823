package ch12api.lecture;

public class C20wrapper {

    public static void main(String[] args) {
        //wrapper class : 기본타입을 감싸고 있는 클래스

        //기본타입 : byte, short, int , long, float, double,char, boolean
        //wrapper class : Byte, Short, Integer, Long,Float, Double,Character,Boolean

        //boxing : 기본타입 -> 참조타입
        //unboxing : 참조타입 -> 기본타입

        //boxing
        int i = 500;
        Integer j = new Integer(i); // 버전업이 되면 없어질가능성이 높기때문에
        // 쓰지말라 함

        Integer k = Integer.valueOf(i); //그렇기에 쓸라면 valueOf로 해준다.

        System.out.println(i);
        System.out.println(j);

        //unboxing
        Integer l = Integer.valueOf(1000);
        int m = l.intValue();

        System.out.println(l);
        System.out.println(m);

        // auto boxing

        int n = 777;
        Integer o = n; // 자동 박싱이 가능하다.

        // auto unboxing
        Integer p = Integer.valueOf(888);
        int q = p;

        System.out.println(o);
        System.out.println(q);
    }
}
