package ch13generic.book.exercise.p03;

public class Container<T, U> {

    private T n;
    private U a;

    public T getKey() {
        return n;
    }

    public void set(T n, U a) {
        this.n = n;
        this.a = a;
    }

    public U getValue() {
        return a;
    }


}
