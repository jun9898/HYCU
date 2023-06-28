package ch05;
import java.util.Arrays;
public class selectionSort {
    public static void main(String[] args) {
        int a[] = {8,6,7,3,5};

        System.out.print("정렬 전의 리스트");
        System.out.println(Arrays.toString(a));

        for (int i=0;i<a.length-1;i++){
            for (int j=i;j<a.length;j++){
                if (a[i] < a[j]){
                    int temp;
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            System.out.print((i+1)+"번째 리스트");
            System.out.println(Arrays.toString(a));
        }
//
//        int a[][] = new int[3][3];
//
//        for(int n = 0; n<a.length;n++){
//            for(int m = 0; m<a[n].length;m++){
//                a[n][m] = m*10+n;
//                System.out.printf("a[%d][%d] = %d\n",n,m,a[n][m]);
//            }
//        }
    }
}
