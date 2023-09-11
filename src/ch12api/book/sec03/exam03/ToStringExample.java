package ch12api.book.sec03.exam03;

public class ToStringExample {

    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("삼성전자", "android");

        String strObj = myPhone.toString();
        System.out.println(strObj);

        System.out.println(myPhone);
    }
}
