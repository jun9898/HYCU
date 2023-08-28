package PlayData.ch09.methodTest;

public class CalculatorEx {
    public static void main(String[] args) {
        Calculator myCal = new Calculator();
        myCal.powerOn();

        int result = myCal.plus(3,5);
        System.out.println(result);

        byte x = 10;
        byte y = 4;

        double result2 = myCal.divide(x,y);
        System.out.println(result2);

        myCal.powerOff();

    }
}
