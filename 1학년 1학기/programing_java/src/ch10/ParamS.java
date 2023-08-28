package ch10;

class E {
    void bye() {
        System.out.println("good bye");
    }
}
class J extends E {
    void bye() {
        System.out.println("안녕히 계세요");
    }
}
class EJ {
    void greet(E e){
        e.bye();
    }
}
public class ParamS {
    public static void main(String[] args) {
        E oe = new E();
        J oj = new J();
        EJ oej = new EJ();

        oej.greet(oe);
        oej.greet(oj);

    }
}
