package ch12;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("역 이름을 입력하세요.");
        String stationName = sc.next();
        System.out.println("플렛폼 번호를 입력하세요.");
        int num = sc.nextInt();

        sc.close();

        System.out.println(stationName +"역"+num+"번 홈입니다.");

    }
}
