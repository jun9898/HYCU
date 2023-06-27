package ch04;

public class compareString {
    public static void main(String[] args) {
        String a = "abc", b = "abc";
        String c = new String("abc");
        String d = new String("abc");

        System.out.print("변수 a="+a+",변수 b="+b);
        System.out.println(", 참조 c="+c+",참조 d="+d);
        System.out.println("a == b : "+ ( a == b ));
        System.out.println("a == c : "+ ( a == c ));
        System.out.println("c == d : "+ ( c == d ));
        System.out.println("c.equals(a) : "+ c.equals(a));
        System.out.println("a.equals(c) : "+ a.equals(c));
        // 문자열의 대소는 비교 못함.
        d = a; // d는 변수 a의 참조(별칭)
        System.out.println("참조 d = 변수 a 실행 후");
        System.out.println("a == d : "+(a==d));
    }
}
