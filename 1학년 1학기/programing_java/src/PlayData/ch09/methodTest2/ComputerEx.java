package PlayData.ch09.methodTest2;

public class ComputerEx {
    public static void main(String[] args) {
        Computer test = new Computer();

        int[] testSum = {1,2,3,4,5,6,7};

        int result = test.sum1(testSum);
        System.out.println(result);

        int result2 = test.sum2(1,2,3,4,5,6,7);
        System.out.println(result2);
    }
}
