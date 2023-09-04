package ch09nested.lecture;

public class C06localClass {


    public void method2() {
        class LocalClass {

            // 필드, 생성자, 메소드

            //로컬 클래스를 쓰는 이유 : 메소드 안에서만 활용하려고
        }
        LocalClass o1 = new LocalClass();
    }
}
