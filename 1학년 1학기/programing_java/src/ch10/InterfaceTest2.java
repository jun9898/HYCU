package ch10;
interface IA {
    public abstract void sayA();
}
interface IB {
    public abstract void sayB();
}
interface IC {
    public abstract void sayC();
}
class X implements IA,IB,IC {
    public void sayA(){
        System.out.println("A:Hello");
    }
    public void sayB(){
        System.out.println("B:Hello");
    }
    public void sayC(){
        System.out.println("C:Hello");
    }
}
public class InterfaceTest2 {
    public static void main(String[] args) {
        X ox = new X();

        ox.sayA();
        ox.sayB();
        ox.sayC();

    }
}
