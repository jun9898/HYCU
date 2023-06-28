package ch06;

class AA{
    int add(int a, int b){
        int x ;
        x = a+b ;
        return x ;
    }
}

class B{
    double half(){
        double a = 5.0, b;
        b = a / 2.0;
        return b ;
    }
}

class C{
    void disp (int a){
        System.out.println("인수의 값은 " + a);
        return;
    }
}

class D{
    void print (){
        System.out.println("Hello");
        return;
    }
}
public class MethodTest {
    public static void main(String[] args) {

        D d = new D();
        d.print();

//        C c = new C();
//        c.disp(100);

//        A a = new A();
//        System.out.println("a.add(1,2) = "+a.add(1,2));

        B b = new B();
        System.out.println("b.half() = "+b.half());

    }
}
