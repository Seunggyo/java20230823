package ch07extends.book.sec02;

public class SmartPhoneExample {

    //실행
    public static void main(String[] args) {
        //스마트폰 설계도로 만든 인스턴스
        SmartPhone myPhone = new SmartPhone("아이폰", "파란색");
        System.out.println("모델 : " + myPhone.model);
        System.out.println("색상 : " + myPhone.color);
        System.out.println("와이파이 상태 : " + myPhone.wifi);

        //폰에 있는 메소드와 스마트폰에 있는 메소드를 활용하여 다 작성
        myPhone.bell();
        myPhone.sendVoice("여보세요");
        myPhone.receiveVoice("안녕하세요 000입니다.");
        myPhone.sendVoice("잘못거셨습니다");
        myPhone.hangUp();
        myPhone.setWifi(true);
        myPhone.internet();
    }
}
