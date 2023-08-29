package ch07extends.book.sec04.exam01;

public class ComputerExample {

    public static void main(String[] args) {
        int r = 10;

        System.out.println("원의 반지름은 " + r);
        System.out.println();

        Calculator calculator = new Calculator();
        System.out.println("원 면적 : " + calculator.areaCircle(r));
        System.out.println();

        Computer computer = new Computer();
        System.out.println("원 면적 : " + computer.areaCircle(r));
    }
}
