package ch05reference;

public class C03referebce {

    public static void main(String[] args) {
        int a = 5;
        int b = a;

        String c = "java";
        String d = c;

        System.out.println(a == b); //값은 true
        System.out.println(d == c); //값은 true

        
    }
}
