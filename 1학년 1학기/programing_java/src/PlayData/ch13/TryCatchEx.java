package PlayData.ch13;

public class TryCatchEx {
    public static void main(String[] args) {
        try{
            Class clas = Class.forName("String");
        } catch (ClassNotFoundException e){
            System.out.println("클래스가 존재하지 않습니다.");
        } finally {
            System.out.println("프로그램이 종료됩니다");
        }
    }
}
