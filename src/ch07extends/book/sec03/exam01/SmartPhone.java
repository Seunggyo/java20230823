package ch07extends.book.sec03.exam01;

public class SmartPhone extends Phone {

    public SmartPhone(String model, String color) {
        super();
        this.model = model;
        this.color = color;
        System.out.println("SmartPhone(String model, String color 생성자 샐행됨");
    }

}
