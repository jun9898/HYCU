package PlayData.ch09.returnTest;

public class CarEx {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.setGas(5);

        boolean gasState = myCar.isLeftGas();

        if(gasState){
            System.out.println("run");
            myCar.run();
        }

        if(myCar.isLeftGas()){
            System.out.println("enough gas");
        } else {
            System.out.println("plz charge gas");
        }

    }
}
