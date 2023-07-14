package PlayData.ch11;

public class DmbCellPhoneEx {
    public static void main(String[] args) {
        DmbCellPhone dmbCellPhone = new DmbCellPhone("자바몬", "검정", 10);

        System.out.println("모델명 : " + dmbCellPhone.model);
        System.out.println("색상 : " + dmbCellPhone.color);
        System.out.println("채널 : " + dmbCellPhone.channel);

        dmbCellPhone.powerOn();
        dmbCellPhone.bell();
        dmbCellPhone.sendVoice("여보세요");
        dmbCellPhone.receiveVoice("안녕하세요");
        dmbCellPhone.sendVoice("반갑습니다");
        dmbCellPhone.hangUp();

        dmbCellPhone.turnOnDmb();
        dmbCellPhone.changeChannelDmb(76);
        dmbCellPhone.turnOffDmb();
    }
}
