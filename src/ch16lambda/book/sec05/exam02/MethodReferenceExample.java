package ch16lambda.book.sec05.exam02;

public class MethodReferenceExample {

    public static void main(String[] args) {
        Person person = new Person();
        person.ordering(String::compareToIgnoreCase);

        //compareToIgnoreCase 대소문자 구분없이 사전순으로 비교
    }
}
