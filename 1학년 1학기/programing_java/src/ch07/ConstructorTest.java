package ch07;

class A {
    int a,b,c;
    float d;

    A() {
        a = 1;
        b = 2;
        c = 3;
        System.out.println("생성자 A() 가 호출됨");
    }
}

public class ConstructorTest {
    public static void main(String[] args) {

        A a = new A();

        System.out.printf("a.a = %d, a.b = %d, a.c = %d, a.d = %f",
                a.a,a.b,a.c,a.d);
    }
}
