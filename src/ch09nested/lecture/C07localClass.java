package ch09nested.lecture;

public class C07localClass {

    void method1() {
        //로컬 클래스에서 사용되는
        // 감싸고 있는 메소드의 지역변수는
        // 값을 변경할 수 없음 (final, effectively final)

        final int value = 0;
        class LocalClass {

            void method() {
                System.out.println(value);
            }
        }
    }

    // 만약 어디선가 method를 호출할때 method2(30)이라고 호출을 하게 되는데
    // 호출값을 끝으로 더이상 값을 변경 할 수 없다.
    void method2(final int param) {
        // 파라미터가 local class에서 사용되면
        // 파라미터의 값을 변경할 수 없음
        class LocalClass {

            void method() {
                System.out.println(param);
            }
        }
    }
}
