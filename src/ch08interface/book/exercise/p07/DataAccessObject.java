package ch08interface.book.exercise.p07;

public interface DataAccessObject {

    String db();

    void select();

    void insert();

    void update();

    void delete();
}
