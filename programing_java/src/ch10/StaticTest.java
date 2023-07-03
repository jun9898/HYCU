package ch10;

class A {
    static int a;
}

class B {
    private static int b = 1;
    static int get(){
        return b;
    }
}
public class StaticTest {
    public static void main(String[] args) {
        B b = new B();
        System.out.println("b.b = " + b.get());
        System.out.println("B.b = " + B.get());
    }
}
