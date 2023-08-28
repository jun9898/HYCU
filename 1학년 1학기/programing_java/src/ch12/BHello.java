package ch12;

class OuterClass {
    private int a = 10;
    public void outerTest(){
        System.out.println("outerTest");
    }
    class InnerClass {
        public void innerTest(){
            System.out.println("innerTest");
        }
        public void innerTestInt(){
            System.out.println(a);
        }
    }
}

public class BHello {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();

        inner.innerTest();
        inner.innerTestInt();
    }
}
