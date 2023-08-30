package ch07extends.lecture;

public class C22extends {

    public static void main(String[] args) {
        MySubClass221 o1 = new MySubClass221();

    }
}

class MyClass22 {

    MyClass22() {
        //초기화 코드 작성됨...

        System.out.println("상위 클래스 초기화 코드들");
    }
}

class MySubClass221 extends MyClass22 {

    MySubClass221() {
        //상위 클래스 생성자 호출(초기화하는 코드)
        super();
        //가장 위에 꼭 있어야 한다.
        //안쓰면 자동생성
        //MySubClass221 인스턴스 초기화 코드 작성...

        System.out.println("하위 클래스 초기화 코드");
    }
}