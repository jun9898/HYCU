package ch12;

class BoxingTest {
    static void test_boxing(Integer a){
        System.out.println("Integer a = "+a);
        return;
    }
    static void test_unboxing(int b){
        System.out.println("int b = "+b);
        return;
    }
}
public class WrapperClass {
    public static void main(String[] args) {
//        BoxingTest a = new BoxingTest();
//        a.test_boxing(10);
//        a.test_unboxing(20);

//        String b = "ABCDEF";
//        System.out.println(b.length());

//        String b = "ABCDEF";
//        System.out.println(b.substring(2,5));

        String a = "ABC";
        String b = "DBX";
        System.out.println(a.compareTo(b));
    }
}
