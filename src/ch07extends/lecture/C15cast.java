package ch07extends.lecture;

public class C15cast {

    public static void main(String[] args) {
        System.out.println("프로그램 실행 시작!!");
        Animal15 ani1 = new Dog15();
        Animal15 ani2 = new Cat15();

        Dog15 d1 = (Dog15) ani1;
        Cat15 c1 = (Cat15) ani2;

//        Cat15 c2 = (Cat15) ani1; //안된다. , 하지만 문법오류는 안난다. 컴파일이 아예 안된것은 아님
//        Dog15 d2 = (Dog15) ani2; //마찬가지로 안됨 문법오류도 아니라 사람도 ide에서도 찾기 힘들다

        System.out.println("프로그램 실행 계속됨...");
    }
}

class Animal15 {

}

class Dog15 extends Animal15 {

}

class Cat15 extends Animal15 {

}
