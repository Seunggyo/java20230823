package ch12api.lecture;

public class C04getterSetter {

    public static void main(String[] args) {
        MyClass04 o1 = new MyClass04();
        o1.setName("손흥민");
        System.out.println(o1);
        o1.setAge(33);
        System.out.println(o1);
        System.out.println(o1.getName());
        System.out.println(o1.getAge());

    }

}

class MyClass04 {

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "MyClass04{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
    }
}

