package ch12api.lecture;

public class C22wrapper {

    public static void main(String[] args) {
        Integer i = 3000;
        Integer j = 3000;

        int k = 30;
        int l = 30;

        System.out.println(k == l);

        System.out.println(i == j); //참조값 비교를 하기때문에 다르다 나온다.
        System.out.println(System.identityHashCode(i));
        System.out.println(System.identityHashCode(j));

        System.out.println(i.equals(j)); //참조값이기때문에 String 처럼 equals
    }
}
