package ch12api.lecture;

public class C03toString {

    public static void main(String[] args) {
        Car car = new Car("tesla", 5000);
        Car car1 = new Car("kia", 3000);
        Car car2 = new Car("bmw", 4000);

        System.out.println(car1.getModel() + ": " + car1.getPrice());
        System.out.println(car.getModel() + ": " + car.getPrice());
        System.out.println(car2.getModel() + ": " + car2.getPrice());

        System.out.println();

        System.out.println(car1.toString());
    }
}

class Car {

    private String model;
    private int price;

    public Car(String model, int price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }


    // 객체를 설명하는 문자열 리턴
    @Override
    public String toString() {
        return this.model + ": " + this.price;
    }
}
