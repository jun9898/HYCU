package PlayData.ch12.ex02;

public class PhoneEx {
    public static void main(String[] args) {
//        Phone phone = new Phone(); 객체로 만들 수 없음 설계도의 개념으로 이해해야 함
        SmartPhone sp = new SmartPhone("홍길동");

        sp.turnOn();
        sp.internetSearch();
        sp.turnOff();
    }
}
