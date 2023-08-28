package ch05;
import java.util.Scanner;

public class programing {
    public static void main(String[] args) {
        String dict[][] = {{"animal","동물"},{"cat","고양이"},{"cow","소"},{"dog","개"},
                {"elephant","코끼리"},{"fox","여우"},{"giraffe","기린"},{"horse","말"},{"lion","사자"},
                {"tiger","호랑이"}};

        Scanner input = new Scanner(System.in);
        String word;
        int n;

        System.out.print("동물의 영어단어를 입력 : ");
        word = input.next();

        for(n=0; n<9; n++) {
            if (word.equalsIgnoreCase((dict[n][0]))) {
                System.out.println(dict[n][0] + "은 " + dict[n][1] + " 입니다.");
                break;
            }
        }
        if (n == 9)
            System.out.println(word + "은 사전에 없습니다.");
    }
}
