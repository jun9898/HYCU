package PlayData.ch12.ex05;

public class SmartTelevision implements RemoteControl, Searchable{
    private int volume;
    @Override
    public void turnOn() {
        System.out.println("스마트 티비를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("스마트 티비를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if(volume > PlayData.ch12.ex04.RemoteControl.MAX_VOLUME){
            this.volume = PlayData.ch12.ex04.RemoteControl.MAX_VOLUME;
        } else if (volume < PlayData.ch12.ex04.RemoteControl.MIN_VOLUME) {
            this.volume = PlayData.ch12.ex04.RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println(" 현재 스마트 티비 볼륨 : " + this.volume);
}
    @Override
    public void search(String url) {
        System.out.println(url + "을 검색합니다.");

    }
}
