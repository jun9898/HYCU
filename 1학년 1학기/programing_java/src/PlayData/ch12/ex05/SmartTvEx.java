package PlayData.ch12.ex05;

public class SmartTvEx {
    public static void main(String[] args) {
        SmartTelevision tv = new SmartTelevision();

        RemoteControl rc = tv;
        Searchable searchable = tv;
        rc.turnOn();
    }
}
