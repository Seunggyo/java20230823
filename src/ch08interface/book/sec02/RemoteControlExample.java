package ch08interface.book.sec02;

public class RemoteControlExample {

    public static void main(String[] args) {
        RemoteControl rc;
        rc = new Television();
        rc.turnOn();

        // 346p Audio class 작성
        // 346p 11~13 줄 추가
        //오디오 객체로 변경
        rc = new Audio();
        rc.turnOn();


    }
}
