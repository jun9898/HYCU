package ch10;
final class Animal{
    final int a = 3;
}
//class Cat extends Animal { final class 는 상속할 수 없음
//}
public class FinalLimEr {
    public static void main(String[] arg) {

        Animal dog = new Animal();
//        Cat mu = new Cat();

//        dog.a=5; final 값은 변경할 수 없음
    }
}
