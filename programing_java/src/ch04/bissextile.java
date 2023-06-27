package ch04;
import java.util.Scanner;

public class bissextile {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int yr;
        boolean A,B,C,Y1,Y2,Y3;

        System.out.println("연도를 입력하시오.");
        yr = sc.nextInt();

        A = (yr % 4) == 0;
        B = (yr % 100) == 0;
        C = (yr % 400) == 0 ;

        Y1 = (A && !B && !C) || (A && !B && C) || (A && B && C);
        Y2 = (A && !B) || (A && C);
        System.out.println("방법 1 : " + yr + "년은 윤년인가?" + Y1);
        System.out.println("방법 2 : " + yr + "년은 윤년인가?" + Y2);
    }
}
