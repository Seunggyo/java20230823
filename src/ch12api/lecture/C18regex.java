package ch12api.lecture;

public class C18regex {

    public static void main(String[] args) {
        //regular expression : 정규표현식(정규식, 정규식표현)
        //문자열의 패턴을 나타내는 기호들

        //문자
        System.out.println("x".matches("x")); //true
        System.out.println("a".matches("a")); //true
        System.out.println("a".matches("x")); //false

        //문자들
        System.out.println("xyz".matches("xyz")); //true
        System.out.println("xxx".matches("xxx")); //true
        System.out.println("xxx".matches("x")); //false

        //수량자(quantifiers)
        System.out.println("xxx".matches("x{3}")); //true
        System.out.println("aaa".matches("a{3}")); //true
        System.out.println("aa".matches("a{3}")); //false
        System.out.println("aaa".matches("a{1,3}"));
        System.out.println("aa".matches("a{1,3}"));
        System.out.println("a".matches("a{1,3}"));

        System.out.println("dog".matches("do{1,3}g"));
        System.out.println("dooog".matches("do{1,3}g"));
        System.out.println("doog".matches("do{1,3}g"));
        System.out.println("dooooog".matches("do{1,3}g"));

        //패턴 그룹화 : ()

        System.out.println("dodog".matches("(do){1,3}g"));
        System.out.println("dododog".matches("(do){1,3}g"));
        System.out.println("dog".matches("(do){1,3}g"));
        System.out.println("doog".matches("(do){1,3}g"));
        System.out.println("dodoog".matches("(do){1,3}g"));

        //수량 :
        System.out.println("dog".matches("do{1,}g"));
        System.out.println("doog".matches("do{1,}g"));
        System.out.println("dooog".matches("do{1,}g"));
        System.out.println("doooog".matches("do{1,}g"));
        System.out.println("dooooog".matches("do{1,}g"));

        // 다른것 : 패턴? : 패턴{0,1} 패턴*: 패턴{0,}  패턴+ : 패턴{1,}
        //?: 없거나 한번
        System.out.println("dg".matches("do?g"));
        System.out.println("dog".matches("do?g"));
        System.out.println("doog".matches("do?g"));

        //* : 0번 이상
        System.out.println("dg".matches("do*g"));
        System.out.println("dog".matches("do*g"));
        System.out.println("doooog".matches("do*g"));
        System.out.println("dooog".matches("do*g"));
        System.out.println("dooooog".matches("do*g"));

        // + : 한번 이상
        System.out.println("dg".matches("do+g"));
        System.out.println("dog".matches("do+g"));
        System.out.println("doog".matches("do+g"));
        System.out.println("dooog".matches("do+g"));

        // 문자 분류(Character classes)
        System.out.println("문자분류");
        System.out.println("dog".matches("d[oi]g"));
        System.out.println("dig".matches("d[oi]g"));
        System.out.println("dag".matches("d[oi]g"));

        // [^문자들] : 문자들이 아닐때라는 뜻
        System.out.println("dog".matches("d[^oi]g"));
        System.out.println("dig".matches("d[^oi]g"));
        System.out.println("dag".matches("d[^oi]g"));

        //[a-z] : a부터 z까지 다 포함
        //[a-cx-z] : a부터c까지 x부터z까지 포함하는 식

        //문자 분류 기호
        System.out.println("0".matches("[0-9]"));
        System.out.println("7".matches("[0-9]"));
        System.out.println("7".matches("\\d"));
        //자바에서 역슬래시를 쓸때는 역슬래시를 한번 더 써야한다.

        System.out.println("a".matches("[a-zA-z_0-9]"));
        System.out.println("_".matches("[a-zA-z_0-9]"));
        System.out.println("8".matches("[a-zA-z_0-9]"));
        System.out.println("8".matches("\\w"));
        System.out.println("_".matches("\\w"));

        // 예제 : 자바 변수명 작성 규칙
        // 숫자로 시작하면 안되고 영문 대소문자, _, $
        System.out.println("0asdf".matches("[a-zA-Z_$]\\w*"));
        System.out.println("asdf0".matches("[a-zA-Z_$][a-zA-Z_$0-9]*"));

        //전화 번호 패턴
        //010-9999-9999

        String asdf = "(\\d{2,3})-?(\\d{3,4})-?(\\d{4})";
        System.out.println("010-4605-1805".matches(asdf));
        System.out.println("01046051805".matches(asdf));
        System.out.println("a1046051805".matches(asdf));
        System.out.println("022243456".matches(asdf));
        System.out.println("02-222-2222".matches(asdf));
        System.out.println("02-222-222".matches(asdf));

        //모든 문자 : .
        System.out.println(" ".matches("."));
        System.out.println("a".matches("."));
        System.out.println("3".matches("."));
        System.out.println("+".matches("."));

        //이메일 규칙
        //영문 소문자,숫자가 여러개 @ 영문소문자,숫자 여러개 . 영문소문자, 숫자 여러개
        // 예 : john23@google3.co2m
        String e = "[a-z0-9]+@[a-z0-9]+\\.[a-z0-9]+";
        System.out.println("tmdry99@gmail.com".matches(e));
        System.out.println("34tm@gmail23.com3".matches(e));
        System.out.println("34tmgmail23.com3".matches(e));
        System.out.println("344tm@gmailcom2".matches(e));
        System.out.println("344tm@gmail3.com2".matches(e));

        // or : |(pipe기호, or기호, 버티컬바)
        System.out.println("auefhdogsod".matches(".*dog.*"));
        System.out.println("832catlkd".matches(".*cat.*"));
        System.out.println("auefhdogsod".matches(".*(dog|cat).*"));
    }
}
