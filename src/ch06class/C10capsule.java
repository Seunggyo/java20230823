package ch06class;

public class C10capsule {

    public static void main(String[] args) {

    }
}

class MyClass10 {

    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
//캡슐화를 하면서 필드는 특별한 이유가 없다면 private로 만든다
//대신 관련 메소드는 public으로 (get,set으로 만든다.) (get과 set은 읽기 쓰기 전용)