package ch12api.lecture;

public class C21wrapper {

    public static void main(String[] args) {
        int i = 3;
        Integer j = Integer.valueOf(i);
        Object k = j;

        int l = 5;
        Integer m = l;
        Object n = m;

        Object o = 7; //자동박싱이 되기때문에 가능하다

//        int p = o; 불가능
        Integer q = (Integer) o; //강제 형변환을 통해서 가능은하지만 위험
        int r = q;

        int s = 30; //4byte
        long t = s; //8byte

        Integer u = 300;
//        Long v = u; 안된다. 다형성때문에

        float w = 3.14f;
        double x = w;

        Float y = 3.14f;
//        Double z = y; 다형성에 의해 Float가 Double이 될 이유가 하나도 없다.

    }
}
