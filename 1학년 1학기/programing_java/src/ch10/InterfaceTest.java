package ch10;

interface AA {
    public static final int a = 2;
    public void say();
}
class BB implements AA {
    @Override
    public void say() {
        System.out.println("Hello");
    }
}
public class InterfaceTest {
    public static void main(String[] args) {
        BB ob = new BB();

        System.out.println("ob.a = " +ob.a);
        ob.say();
    }
}
