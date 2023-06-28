package ch05;

public class whileTest {
    public static void main(String[] args) {
//        int sum = 0, i = 0;
//
//        while(i<10){
//            i++;
//            sum += i;
//        }
//        System.out.println("1 ~ "+i+"의 합은 = " +sum);

        int sum = 0, i = 0;

        do {
            i ++;
            sum += i;
        } while(i<10);
        System.out.println("1 ~ "+i+"의 합은 = " +sum);
    }
}
