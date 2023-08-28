package ch06;

class Calc {
    int add(int a, int b){
        return a+b;
    }
}

public class MethodTest2 {
    public static void main(String[] args) {
        Calc a = new Calc();
        System.out.println("3 + 9 = " + a.add(3,9));
    }
}
