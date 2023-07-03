package ch11;
import java.io.*;
public class NumberGame {
    public static void main(String[] args) {
        try {
            InputStreamReader key = new InputStreamReader(System.in);
            BufferedReader in = new BufferedReader(key);

            int a, b = 7;
            System.out.println("이름을 입력하세요.");
            String name = in.readLine(); //키보드로부터 문자열 입력

            System.out.println("숫자 맞추기 0~9 사이의 숫자를 입력하세요");
            String c = in.readLine(); //키보드로 문자열 입력
            a = Integer.parseInt(c); //문자를 정수로 변환


            while (a != b) {
                if ((a == b - 1) || (a == b + 1))
                    System.out.println("아깝습니다");
                else if (a > b + 1)
                    System.out.println("좀 더 작은수입니다.");
                else if (a < b - 1)
                    System.out.println("좀 더 큰 수입니다.");

                c = in.readLine();
                a = Integer.parseInt(c);
            }
            System.out.println("정답" + name + "님 축하합니다");
        }
        catch (IOException e) {
            System.out.println("에러입니다.");
        }
    }
}
