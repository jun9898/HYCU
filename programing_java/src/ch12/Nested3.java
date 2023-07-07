package ch12;

class StaticOuter {
    static int oa = 10;

    public static void methodTest() {
        System.out.println("oa = " + oa);
    }

    static class StaticInner {
        int ia = 100;
        public void methodia() {
            methodTest();
            System.out.println("ia = "+ia);
        }
    }
}
public class Nested3 {
    public static void main(String[] args) {
        StaticOuter.StaticInner Test = new StaticOuter.StaticInner();
        Test.methodia();

    }
}
