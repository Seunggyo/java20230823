package ch05reference;

public class C06matrix {

    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        int[][] b = a;

        System.out.println(a[0][2]);
        System.out.println(b[0][2]);

        a[1][1] = 2000;
        System.out.println(a[1][1]); //2000
        System.out.println(b[1][1]); //2000

        b[2][2] = 9999;
        System.out.println(b[2][2]); //300은 9999로 바뀜
        System.out.println(b[2][2]); //b가 바뀌었지만 a는 같은 객체이기 때문에 a도 바뀔 수 밖에 없다.

        b[2] = new int[]{111, 222, 333};
        System.out.println(b[2][2]);
        System.out.println(a[2][2]);

        b = new int[][]{{33, 44}, {22, 11}}; //새로운 객체 생성을 했기 때문에 a와 b는 이순간 다른 값이 된다.
        System.out.println(b[0][0]); //33
        System.out.println(a[0][0]);
    }
}
