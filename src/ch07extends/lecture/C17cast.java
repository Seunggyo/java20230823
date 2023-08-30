package ch07extends.lecture;

public class C17cast {

    public static void main(String[] args) {
        Animal17 ani1 = new Dog17();
        Animal17 ani2 = new Cat17();
//        ani1.bark(); 안됨
        if (ani1 instanceof Dog17) {  // 강제형변환이기에 안전하게 실행시키기위해 진행
            Dog17 d1 = (Dog17) ani1;
            d1.bark();
            //하위타입에 있는 메소드를 실행시키고 싶어서 이러한 과정을 거쳤다.
            //이러한코드는 관용적으로 사용하게된다.
        } else {
            System.out.println("Dog로 형 변환 안됨");
        }
        if (ani1 instanceof Cat17) {
            Cat17 c1 = (Cat17) ani1; //안되는 코드
            c1.meow();
        } else {
            System.out.println("Cat으로 형변환 안됨");
        }
        if (ani2 instanceof Dog17) {
            Dog17 d2 = (Dog17) ani2;
            d2.bark();
        } else {
            System.out.println("Dog로 형변환 안됨");
        }
        if (ani2 instanceof Cat17) {
            Cat17 c2 = (Cat17) ani2;
            c2.meow();

        } else {
            System.out.println("Cat으로 형변환 안됨");
        }

        System.out.println("프로그램 종료 ...");


    }
}

class Animal17 {

}

class Dog17 extends Animal17 {

    public void bark() {
        System.out.println("멍멍 !!!!");
    }
}

class Cat17 extends Animal17 {

    public void meow() {
        System.out.println("야옹~~~~~");
    }
}