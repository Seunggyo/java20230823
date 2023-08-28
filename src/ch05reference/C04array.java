package ch05reference;

public class C04array {

    public static void main(String[] args) {
        int a = 5;
        int b = a;

        System.out.println(a); //5
        System.out.println(b); //5

        int[] c = {3, 4, 5};
        int[] d = c;

        System.out.println(c[1]); //4
        System.out.println(d[1]); //4

        c[2] = 55;
        System.out.println(c[2]); //55
        System.out.println(d[2]); //55 c값을 바꿔도 d는 c에 있는 배열을 참조하기 때문에 그대로 c값을 가져온다
    }
}
