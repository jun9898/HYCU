package test;

interface Bye {
    public abstract void bye();
}

class Greet {
    void greet() {

    }
}
class Greeting extends Greet implements Bye{
    @Override
    void greet() {
        System.out.println("Hi!");
    }
    public void bye(){
        System.out.println("Bye!");
    }
}
public class Test {
    public static void main(String[] args) {
        Greeting n = new Greeting();
        n.greet();
        n.bye();
    }
}
