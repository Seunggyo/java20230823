package ch13generic.book.exercise.p02;

public class Container<T> {

    private T s;

    public void set(T p) {
        this.s = p;
    }

    public T get() {
        return s;
    }
}
