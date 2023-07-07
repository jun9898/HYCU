package ch12;

import java.sql.SQLOutput;

class OuterC {
    int oa = 10;

    public void methodTest() {
        System.out.println("oa = " + oa);

        InnerC oin = new InnerC();
        oin.methodia();

    }

    class InnerC {
        private int ia = 100;
        public void methodia() {
            System.out.println("ia = "+ia);
            System.out.println("oa = "+oa);
        }
    }
}
public class Nested2 {
    public static void main(String[] args) {
        OuterC oout = new OuterC();
        oout.methodTest();
    }
}
