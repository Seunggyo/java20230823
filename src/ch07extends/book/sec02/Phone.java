package ch07extends.book.sec02;

public class Phone {

    //우선 폰에 대한 field생성 모델과 컬러에 대한 field
    public String model;
    public String color;

    //전화 수신음에 관한 method생성
    public void bell() {
        System.out.println("벨이 울립니다.");
    }

    //내가 전화할 메시지에 관한 method 생성
    public void sendVoice(String message) {
        System.out.println("본인 : " + message);
    }

    //상대가 이야기할 메시지 method 생성
    public void receiveVoice(String message) {
        System.out.println("상대방 : " + message);
    }

    //전화를 끊었다는 메소드 생성
    public void hangUp() {
        System.out.println("전화를 끊습니다.");
    }
}
