package ch07extends.book.sec02;

//주로 상속할땐 method이다.
public class SmartPhone extends Phone {

    //와이파이가 연결 되어있는가 아니면 꺼져있는가에 대한 필드 생성
    public boolean wifi; //false상태

    //Phone클래스에서 model과 color 상속 받기
    public SmartPhone(String model, String color) {
        this.model = model;
        this.color = color;

    }

    //wifi상태와 관련된 내용
    public void setWifi(boolean wifi) {
        this.wifi = wifi;
        System.out.println("와이파이 상태를 변경했습니다.");
    }

    //인터넷 상태를 나타내는 method
    public void internet() {
        System.out.println("인터넷에 연결합니다.");
    }
}
