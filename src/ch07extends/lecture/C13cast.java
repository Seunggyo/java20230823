package ch07extends.lecture;

public class C13cast {

    public static void main(String[] args) {
        Animal13 ani1 = new Dog13();
        Animal13 ani2 = new Cat13();

        ani1.breath();
        ani2.breath();

//        ani1.sniff(); //안됨
        //type casting (강제 형 변환) --- 매우위험
        Dog13 d1 = (Dog13) ani1;
        d1.sniff(); //가능

        Cat13 c1 = (Cat13) ani2;
        c1.hunt();

        //자식 클래스의 메소드를 쓸수는 있다 근데 굳이 할 이유가 없다.
    }
}

class Animal13 {

    public void breath() {
        System.out.println("숨쉬다.");
    }
}

class Dog13 extends Animal13 {

    public void sniff() {
        System.out.println("냄새 맡다.");
    }
}

class Cat13 extends Animal13 {

    public void hunt() {
        System.out.println("쥐를 잡다.");
    }
}