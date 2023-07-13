package PlayData.ch09.methodTest;

public class Calculator {
    void powerOn() {
        System.out.println("power on");
    }

    int plus(int x, int y) {
        return x+y;
    }

    double divide(int x, int y) {
        return (double) x/y;
    }

    void powerOff(){
        System.out.println("power off");
    }
}
