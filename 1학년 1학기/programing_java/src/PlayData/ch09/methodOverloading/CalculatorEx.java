package PlayData.ch09.methodOverloading;

public class CalculatorEx {
    public static void main(String[] args) {
        Calculator myCalc = new Calculator();

        double result1 = myCalc.areaRectangle(10);

        double result2 = myCalc.areaRectangle(10,20);

        int x = 10;
        double result3 = myCalc.areaRectangle(x,20);

        System.out.println(result1);
        System.out.println(result2);


    }
}
