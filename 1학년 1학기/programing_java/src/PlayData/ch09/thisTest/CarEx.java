package PlayData.ch09.thisTest;

public class CarEx {
    public static void main(String[] args) {
        PlayData.ch09.classOverloadingTest.Car car = new PlayData.ch09.classOverloadingTest.Car();
        System.out.println("car.company = " + car.company);;
        System.out.println();

        PlayData.ch09.classOverloadingTest.Car car2 = new PlayData.ch09.classOverloadingTest.Car("자가용");
        System.out.println("car2.company = " + car2.company);;
        System.out.println("car2.model = " + car2.model);
        System.out.println();

        PlayData.ch09.classOverloadingTest.Car car3 = new PlayData.ch09.classOverloadingTest.Car("자가용", "빨강");
        System.out.println("car3.company = " + car3.company);
        System.out.println("car3.model = " + car3.model);
        System.out.println("car3.color = " + car3.color);
        System.out.println();

        PlayData.ch09.classOverloadingTest.Car car4 = new PlayData.ch09.classOverloadingTest.Car("택시", "검정", 200);
        System.out.println("car4.company = " + car4.company);
        System.out.println("car4.model = " + car4.model);
        System.out.println("car4.color = " + car4.color);
        System.out.println("car4.maxSpeed = " + car4.maxSpeed);
        System.out.println();
    }
}
