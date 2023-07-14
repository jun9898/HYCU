package PlayData.ch10.exam02.package1;

public class B {
    public static void main(String[] args) {
        A a = new A();
        // 접근 제한자가 걸려있어 직접적으로 메소드와 field에 접근할 순 없지만 생성자가 생성되며
        // 접근 제한자가 걸려있는 method 와 field 값에 접근하게 된다.

        a.field1 = 2;
        a.field2 = 3;
//        a.field3 = 4; 접근 불가능

        a.method1();
        a.method2();
//        a.method3(); 접근 불가능
    }
}
