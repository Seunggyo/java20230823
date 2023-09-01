package ch08interface.book.sec08;

public class MultiInterfaceImplExample {

    public static void main(String[] args) {
        RemoteControl rc = new SmartTelevision();
        rc.turnOn();
        rc.turnOff();

        //변수의 타입이 RemoteControl이기 때문에 SmartTeleveion이어도
        //RemoteControl에 있는 메소드만 사용 가능하다.

        Searchable searchable = new SmartTelevision();
        searchable.serch("https://www.youtube.com/");
    }
}
