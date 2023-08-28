package ch07;

public class MainArgs {
    public static void main(String[] args) {
        int i;
        if (args.length == 0)
            System.out.println("커멘드 라인 인수가 없습니다.");
        else
            for (i = 0; i< args.length;i++)
                System.out.println((i+1) + ": "+args[i]); // 입력된 인수를 출력
    }
}
