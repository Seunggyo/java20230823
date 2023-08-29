package ch07extends.book.sec04.exam02;

public class SupersonicAirplainExample {

    public static void main(String[] args) {
        SupersonicAirplane sa = new SupersonicAirplane();

        //이륙 메소드 가져오기
        sa.takeOff();
        //비행모드 확인시켜주기
        sa.fly();
        //비행모드 변경
        sa.flyMode = SupersonicAirplane.SUPERSONIC;
        //변경된 비행모드 확인
        sa.fly();
        //다시 원래 속도로 변경
        sa.flyMode = SupersonicAirplane.NORMAL;
        //변경된 비행모드 확인
        sa.fly();
        //착륙
        sa.land();
    }
}
