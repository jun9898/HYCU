package PlayData.ch09.thisTest;

public class Car {

    String company = "현대 자동차";
    String model;
    String color;
    int maxSpeed;

    public Car() {
    }

    public Car(String model) {
        this(model, null, 0);
    }

    public Car(String model, String color) {
        this(model, color, 0);
    }

    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
