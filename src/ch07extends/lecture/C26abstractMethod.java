package ch07extends.lecture;

public class C26abstractMethod {

    public static void main(String[] args) {
        Dog26 d1 = new Dog26();
        Fish26 f1 = new Fish26();

        d1.breath();
        Animal26 a1 = d1;
        a1.breath();

        Animal26 a2 = f1;
        a2.breath();
    }

}

//추상메소드를 가진 클래스는 꼭 추상 클래스가 되어야함.
//만약 추상 메소드를 쓰고싶은경우는 추상클래스로 abstract class로 만들어야한다.
abstract class Animal26 {

    //추상 메소드 :abstract method == 몸통이 없는 메소드
    abstract public void breath();
}

class Dog26 extends Animal26 {
    //추상메소드를 꼭 재정의(override)해줘야 한다.

    @Override
    public void breath() {
        System.out.println("폐로 숨을 쉽니다.");
    }
}

class Fish26 extends Animal26 {

    @Override
    public void breath() {
        System.out.println("아가미로 숨을 쉽니다.");
    }
}