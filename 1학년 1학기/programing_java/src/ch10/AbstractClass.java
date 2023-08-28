package ch10;

abstract class Calc1{ // 추상 클래스
    int a;
    int b;
    abstract void answer(); // 추상 메소드

    void setData(int m, int n){
        a = m;
        b = n;
    }
}
class Plus extends Calc1 {
    void answer() { //answer() 메소드 오버라이딩
        System.out.println(a+" + "+b+" = "+(a+b));
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        Plus ob = new Plus();
        ob.setData(12,34);
        ob.answer();
    }
}
