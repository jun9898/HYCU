package ch07;

class X {
    private int a = 1;
    int aa = 2;
    int getA(){
        return a;
    }
}
class Z extends X {
    int b = 3;
}
public class PrivateAccess1 {
    public static void main(String[] args) {
        Z oz = new Z();
//        System.out.println("oz.a = "+ oz.a); 상위 클래스 X의 a 접근 불가능
        System.out.println("oz.a = "+ oz.aa); // 상위 클래스 X의 aa는 접근 가능
    }
}
