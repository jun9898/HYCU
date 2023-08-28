package PlayData.ch09.classTest2;

public class Car {
    String color;
    int cc;

    public Car(String color, int cc) {
        this.color = color;
        this.cc = cc;
    }

    public Car() {
        System.out.println("overloading");
    }
}
