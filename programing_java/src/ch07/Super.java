package ch07;

class GreetingTest {
    void bye() {
        System.out.println("슈퍼 클래스: Good bye");
    }
}
class InsaTest extends GreetingTest {
    @Override
    void bye() {
        System.out.println("서브 클래스: bye");
        super.bye();
    }
}

public class Super {
    public static void main(String[] args) {
        InsaTest a = new InsaTest();
        a.bye();
    }
}
