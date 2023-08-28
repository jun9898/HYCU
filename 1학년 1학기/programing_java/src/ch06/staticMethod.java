package ch06;

class A {
    public static void Message(){
        System.out.println("정적 메소드입니다.");
    }
}

public class staticMethod {
    public static void main(String[] args) {
        A ob = new A();
        ob.Message();
        A.Message(); // 객체 없이도 단순 함수처럼 호출 가능!
    }
}
