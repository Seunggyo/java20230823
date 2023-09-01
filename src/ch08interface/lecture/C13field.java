package ch08interface.lecture;

public class C13field {

    public static void main(String[] args) {
        System.out.println(MyInterface13.VALUE);
        System.out.println(MyInterface13.NAME);
        System.out.println(MyInterface13.HOME_ADDRESS);
        //public static이기 때문에 메인에서 바로 쓸수 있다.
    }
}

interface MyInterface13 {

    int VALUE = 30;
    String NAME = "java";
    String HOME_ADDRESS = "seoul";
    //스네이크 케이스로 안했을경우 shift+f6으로 바꿀수있다.
}