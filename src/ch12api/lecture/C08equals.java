package ch12api.lecture;

import java.util.Objects;

public class C08equals {

    public static void main(String[] args) {
        MyClass08 o1 = new MyClass08("이강인", 20);
        MyClass08 o2 = new MyClass08("이강인", 30);
        MyClass08 o3 = new MyClass08("이강인", 30);

        System.out.println(o1 == o2);
        System.out.println(o1.equals(o2));

        System.out.println(o2 == o3); // 비유를 하면 두개의 같은 내용의 책은 있지만
        // a1책 과 a2책은 다르다는것을 알수 있다.
        System.out.println(o2.equals(o3));  //하지만 책에 내용은 같기때문에 같은책이다 할수있다.
    }
}

class MyClass08 {

    private String name;
    private int age;

    public MyClass08(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        MyClass08 myClass08 = (MyClass08) o;

        if (age != myClass08.age) {
            return false;
        }
        return Objects.equals(name, myClass08.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
}