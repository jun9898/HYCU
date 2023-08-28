package PlayData.ch09.classOverloadingTest;

public class Car {

    public String company = "현대 자동차";
    public String model;
    public String color;
    public int maxSpeed;

    public Car() {
    }

    public Car(String model) {
        this.model = model;
    }

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
