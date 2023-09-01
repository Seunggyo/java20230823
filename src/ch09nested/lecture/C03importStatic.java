package ch09nested.lecture;

import static java.lang.Math.random;

public class C03importStatic {

    public static void main(String[] args) {
        //중첩 클래스와 관계는 없는 내용이긴함
        double random = Math.random();
        //원래는 랜덤을 할때는 이런식으로 써야한다.
        //하지만 위에 임포트를 하게 되면
        double random1 = random();
        //이런식으로 적을 수 도 있다.
    }
}
