package ch08interface.book.exercise.p07;

public class OracleDao implements DataAccessObject {

    @Override
    public String db() {
        return "Oracle DB에서";
    }

    @Override
    public void select() {
        System.out.println(db() + " 검색");
    }

    @Override
    public void insert() {
        System.out.println(db() + " 삽입");
    }

    @Override
    public void update() {
        System.out.println(db() + " 수정");
    }

    @Override
    public void delete() {
        System.out.println(db() + " 삭제");
    }
}
