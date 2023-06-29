package ch07;

class Eat{
    void print1(){
        System.out.print(" E ");
    }
    void print2(){
        System.out.print(" A ");
    }
    void print3(){
        System.out.print(" T ");
    }
}

public class Tea {
    public static void main(String[] args) {
        Eat ob = new Eat();
        ob.print3();
        ob.print1();
        ob.print2();
    }
}
