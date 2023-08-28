package PlayData.ch10.exam03.package2;

import PlayData.ch10.exam03.package1.Car;

public class CarEx {
    public static void main(String[] args) {
        Car myCar = new Car();

        System.out.println("myCar.getSpeed() = " + myCar.getSpeed());
        myCar.setSpeed(50);
        System.out.println("myCar.getSpeed() = " + myCar.getSpeed());

        if (!myCar.isStop()){
            myCar.setStop(true);

        }
        System.out.println("myCar.getSpeed() = " + myCar.getSpeed());
    }
}
