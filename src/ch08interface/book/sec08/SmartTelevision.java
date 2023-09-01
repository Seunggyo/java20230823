package ch08interface.book.sec08;

public class SmartTelevision implements RemoteControl, Searchable {

    @Override
    public void turnOn() {
        System.out.println("Tv를 킵니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("Tv를 끕니다.");
    }

    @Override
    public void serch(String url) {
        System.out.println(url + "을 검색 합니다.");
    }
}
