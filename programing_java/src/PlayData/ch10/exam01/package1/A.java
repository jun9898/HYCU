package PlayData.ch10.exam01.package1;

public class A {

    A a1 = new A(true);
    A a2 = new A(1);
    A a3 = new A("문자열");
    A a4 = new A(1,2,3,4,5);

    public  int field1;
    int field2;
    private  int field3;

    public A(boolean b) {}

    A(int b){}

    private A(String s){}
    protected  A(int ... value){}

}
