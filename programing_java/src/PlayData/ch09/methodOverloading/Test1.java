package PlayData.ch09.methodOverloading;

public class Test1 {
    int plus(int x, int y){
        System.out.println("x+y");
        return x+y;
    }
    int plus(int ... values){
        System.out.println("sum values");

        int sum = 0;

        for (int value:values){
            sum += value;
        }
        return sum;
    }
}
