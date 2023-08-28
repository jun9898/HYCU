package ch10;

class Purse {
    static int money = 0;

    void printMoney(int in, int out){
        money = money + in - out;
        if (money < 0) {
            System.out.println("출금은 "+ out +"원 입니다.");
            System.out.println((-1*money)+"원 부족합니다.");
        }
        else{
            System.out.println("입금은 "+ in +"원 입니다.");
            System.out.println("출금은 "+ out +"원 입니다.");
            System.out.println("잔금은 "+ money +"원 입니다.");
        }
    }
}

public class Shopping {
    public static void main(String[] args) {
        Purse a = new Purse();
        Purse a1 = new Purse();
        a.printMoney(5000,3000);
        a1.printMoney(5000,3000);
    }
}
