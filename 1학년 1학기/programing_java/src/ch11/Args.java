package ch11;

public class Args {
    public static void main(String[] args) {
        try {
            back(args[0]);
        }
        catch (Exception e){
            System.out.println("커맨드 라인 인수가 없습니다.");
        }
        finally {
            System.out.println("종료합니다.");
        }
    }
    static void back(String a) throws Exception {
        System.out.println("코맨드 라인 인수는 "+a+"입니다.");
    }
}
