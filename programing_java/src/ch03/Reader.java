package ch03;
import java.io.*;
import java.util.*;

public class Reader {
    public static void main(String[] args) throws IOException {
        //inputStreamReader isr = new InputStreamReader(System.in); 문자 단위로 입력
        // BufferedReader in = new BufferedReader(isr); // readLine() 메소드가 지원됨
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); // readLine() 메소드가 지원됨

        String name;
        int age;

        System.out.println("나이와 이름을 입력하세요.");

        age = Integer.parseInt(in.readLine()); // 문자열을 정수로 변환
        name = in.readLine(); // 엔터키를 기준으로 줄단위 입력

        System.out.println(name + "은 멋진 이름입니다.");
        System.out.println(age + "세는 자바를 공부하기 좋은 나이입니다.");
    }
}
