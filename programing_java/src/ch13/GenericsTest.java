package ch13;

class CName<T>{
    private T t; // 제네릭 타입 필드
    void set(T t){ // 제네릭 타입의 파라미터 메소드
        this.t = t;
    }
    T get() { // 제네릭 타입의 반환 메소드
        return t; // int가 들어오면 int를 반환 String이 들어오면 String을 반환
    }
    // static이 붙은 경우 T 타입은 제네릭 클래스의 T 타입과 다른 독립적인 타입임
    // <T>는 매개인자고 T타입은 인수의 형식에 따라 결정됨
    static <T> T SMethod(T obj){
        return obj;
    }
// 제네릭 타입이 들어간 static 메서드는 오버로딩을 지원하지 않음
//    T SMethod(T ob){
//        return ob;
//    }
}


public class GenericsTest {
    public static void main(String[] args) {

        CName<String> obs = new CName<String>(); // 생성자 T에 Stirng 지정
        CName<Integer> obn = new CName<Integer>(); // 생성자 T에 Int 지정

        obs.set("123"); // 각각 string과 int만 넣을 수 있음
        obn.set(123);

        // 반환된 변수가 어떤 타입인지 출력
        System.out.println("obs field = " + obs.get());
        System.out.println("obs <T> Type = " + obs.get().getClass().getName());

        // 반환된 변수가 어떤 타입인지 출력
        System.out.println("obn field = " + obn.get());
        System.out.println("obn <T> Type = " + obn.get().getClass().getName());

        // 제네릭 정적 메소드의 T는 String
        System.out.println("SMethod <T> Type = " + CName.SMethod("ABC").getClass().getName());

        // 제네릭 정적 메소드의 T는 Integer
        System.out.println("SMethod <T> Type = " + CName.SMethod(123).getClass().getName());

        // 제네릭 정적 메소드의 T는 CName
        System.out.println("SMethod <T> Type = " + CName.SMethod(obs).getClass().getName());

        // 제네릭 정적 메소드의 T는 Double
        System.out.println("SMethod <T> Type = " + obs.SMethod(123.456).getClass().getName());
    }
}
