package ch07extends.book.sec10.exam02;

public class AbstractMethodExample {

    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();

        Cat cat = new Cat();
        cat.sound();

        animalSound(new Dog());
        animalSound(new Cat());
    }

    private static void animalSound(Animal animal) {
        animal.sound();
    }
}
