package ch07extends.book.sec05.exam02;

public class SportsCar extends Car {

    @Override
    public void speedUp() {
        speed += 10;
    }
//    @Override
//    public void stop(){
//        System.out.println("스포츠카를 멈춤");
//        speed =0;
    //이미 final 선언을 했기때문에 재정의 할수 없다.
//    }
}
