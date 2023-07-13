package PlayData.ch09.singleton;

public class SingletonEx {
    public static void main(String[] args) {
//        Singleton singleton = new Singleton(); 해당 class는 생성 불가하다.
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        if (singleton1 == singleton2){
            System.out.println("같은 객체입니다.");
        } else {
            System.out.println("다른 객체입니다");
        }
    }
}
