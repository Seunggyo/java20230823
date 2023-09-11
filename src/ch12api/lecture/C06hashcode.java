package ch12api.lecture;

public class C06hashcode {

    public static void main(String[] args) {
        String o1 = new String("java");
        String o2 = new String("spring");
        String o3 = new String("java");

        System.out.println(o1 == o2);
        System.out.println(o1.hashCode());
        System.out.println(o2.hashCode());
        System.out.println(o3.hashCode());
        System.out.println(o1 == o3);

        Object o4 = o1;
        Object o5 = o3;
        System.out.println(o4.hashCode());
        System.out.println(o5.hashCode());
        System.out.println(o1 == o4);

        //문자열의 길이가 같고 각 위치에 있는 문자가 같으면 해쉬코드는 같을 수 밖에 없다.
    }
}
