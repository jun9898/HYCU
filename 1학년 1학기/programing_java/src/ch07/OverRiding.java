package ch07;

class Greeting {
    void bye(){
        System.out.println("good bye");
    }
}

class Insa extends Greeting {
    @Override
    void bye() {
        System.out.println("안녕히 계세요");
    }
}

public class OverRiding {
    public static void main(String[] args) {

        Insa a = new Insa();

        a.bye();
    }
}
