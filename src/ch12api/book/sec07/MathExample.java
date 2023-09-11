package ch12api.book.sec07;

public class MathExample {

    public static void main(String[] args) {
        double v1 = Math.ceil(5.3);  // 올림
        double v2 = Math.floor(5.3); // 내림
        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);

        long v3 = Math.max(3, 7); //둘중에 큰값
        long v4 = Math.min(3, 7); // 둘중에 작은값
        System.out.println("v3 = " + v3);
        System.out.println("v4 = " + v4);

        double value = 12.3456;
        double temp1 = value * 100; //1234.56
        long temp2 = Math.round(temp1); //1235
        double v5 = temp2 / 100.0; //12.35
        System.out.println("v5 = " + v5);

    }

}
