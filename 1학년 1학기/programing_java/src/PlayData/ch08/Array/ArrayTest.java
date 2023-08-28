package PlayData.ch08.Array;
public class ArrayTest {
    public static void main(String[] args) {
        int[] scores = new int[10];
        int sum = 0;

        for (int i = 0 ; i < 10 ; i ++){
            scores[i] = i+1;
        }

        for (int i = 0 ; i < 10 ; i ++){
            sum += scores[i];
        }

        System.out.println((double)sum/10);
    }
}
