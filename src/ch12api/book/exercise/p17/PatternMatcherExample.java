package ch12api.book.exercise.p17;

public class PatternMatcherExample {

    public static void main(String[] args) {
        String id = "Angel10";
        String regExp = "[a-zA-Z][a-zA-Z\\d]{7,11}";
        boolean isMatch = id.matches(regExp);
        if (isMatch) {
            System.out.println("id로 사용할수 있습니다.");

        } else {
            System.out.println("id로 사용할 수 없습니다");
        }
    }
}
