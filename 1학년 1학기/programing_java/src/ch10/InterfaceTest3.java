package ch10;

class Greet{
    void greet(){
    }
}

interface Bye{
    void bye();
}
class Greeting extends Greet implements Bye{
    @Override
    void greet() {
        System.out.println("Hello!");
    }

    @Override
    public void bye() {
        System.out.println("Bye!");
    }
}
public class InterfaceTest3 {
    public static void main(String[] args) {
        Greeting hi = new Greeting();
        hi.greet();
        hi.bye();
    }
}
