package ch10;

interface Aa{
    int a = 1;
    public abstract void f();
}
interface Bb{
    int b = 2;
    public abstract void g();
}
interface Cc{
    int c = 3;
    public abstract void h();
}
interface Xx extends Aa,Bb,Cc{
    int d = 4;
    void i();
}

class CX implements Xx{
    @Override
    public void f() {
        System.out.println("interface Aa's f,a = " + a);
    }
    @Override
    public void g() {
        System.out.println("interface Bb's g,b = " + b);
    }
    @Override
    public void h() {
        System.out.println("interface Cc's h,c = " + c);
    }
    @Override
    public void i() {
        System.out.println("interface Xx's i,d = " + d);
    }
}
public class InterfaceX {
    public static void main(String[] args) {
        CX ox = new CX();

        ox.f();
        ox.g();
        ox.h();
        ox.i();
    }
}
