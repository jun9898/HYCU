package ch07;

class B {
    int s, t;
    float d;

    B (int a, int b){
        s = a;
        t = b;
        System.out.println("생성자 B()가 호출됨");
    }
}

public class ConstructorTest_2 {
    public static void main(String[] args) {

        B b = new B(3,4);

        System.out.printf("b.s = %d, b.t = %d, b.d = %f", b.s,b.t,b.d);

    }
}
