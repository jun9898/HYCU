package ch10;
class XX {
    int m = -10;
    XX(){
        System.out.println("슈퍼클래스 X의 생성자 실행");
    }
}
class Y extends XX{
    int n = 10;
    Y(){
        System.out.println("서브클래스 Y의 생성자 실행");
    }
}
public class polymorphismTest2 {
    public static void main(String[] args) {
        System.out.println("XX xx = new XX();");
        XX xx = new XX();
        System.out.println();

        System.out.println("XX xx2 = new Y();");
        XX xx2 = new Y();
        System.out.println("xx2.m = " + xx2.m);

    }

}
